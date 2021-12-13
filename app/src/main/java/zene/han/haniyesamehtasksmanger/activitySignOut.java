package zene.han.haniyesamehtasksmanger;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class activitySignOut extends AppCompatActivity
{
    private TextInputEditText elEmail, elPassword, elRePassword, elPhone, elFullName;
    private Button save1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_out);

        elEmail = findViewById(R.id.elEmail);
        elPassword = findViewById(R.id.elPassword);
        elRePassword = findViewById(R.id.elRePassword);
        elPhone = findViewById(R.id.elPhone);
        elFullName = findViewById(R.id.elFullName);
        save1 = findViewById(R.id.save1);

        save1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                vaildate();

            }
        }
        );
    }


    private void vaildate()
    {

        boolean is0k = true;
        String email = elEmail.getText().toString();
        String pass1 = elPassword.getText().toString();
        String pass2 = elRePassword.getText().toString();
        String phone = elPhone.getText().toString();
        String name = elFullName.getText().toString();
        if (elEmail.length() < 5 || email.indexOf('@') <= 0)
        {
            elEmail.setError("wrong email syntax");
            is0k=false;
        }
        if(pass1.length()<8)
        {
            elPassword.setError("at least 8 chars");
            is0k=false;
        }
        if(pass1.equals(pass2)==false)
        {
            elRePassword.setError("not the same password");
            is0k=false;
        }
        if(name.length()==0)
        {
            elFullName.setError("must to enter fullname");
            is0k=false;
        }
        if (phone.length()!=10)
        {
            elPhone.setError("The Phone Number Is Not True");
            is0k=false;
        }
        if (is0k)//isok==true
        {
            createtAccount(email,pass1);
        }


    }

    private void createtAccount(String email, String pass1)
    {
        FirebaseAuth auth=FirebaseAuth.getInstance();
        //request                        //wait for response
        auth.createUserWithEmailAndPassword(email,pass1).addOnCompleteListener(this, new OnCompleteListener<AuthResult>()
        {
            //response handler
            @Override
            public void onComplete(@NonNull Task<AuthResult> task)
            {
               if (task.isSuccessful()==true)
               {
                   finish();
                   startActivity(new Intent(getApplicationContext(),MainActivity.class));
               }
               else
               {
                   //doing
                   Toast.makeText(getApplicationContext(), "error create account"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();

               }
            }
        });
    }


}