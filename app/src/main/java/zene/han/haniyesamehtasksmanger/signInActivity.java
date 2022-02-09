package zene.han.haniyesamehtasksmanger;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signInActivity extends AppCompatActivity
{

    private TextInputEditText etEmail,etPassword;
    private Button signin,rester;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
        signin=findViewById(R.id.signin);
        rester=findViewById(R.id.rester);

        rester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(), activitySignOut.class));

            }

        });
                signin.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        validate();
                    }
                });


    }
    private void validate()
    {
        boolean is0k=true;
        String email=etEmail.getText().toString();
        String passw=etPassword.getText().toString();
        if (email.length()==0)
        {
            etEmail.setError("enter email");
            is0k=false;
        }
        if (passw.length()<8)
        {
            etPassword.setError("password at east 8 letters");
            is0k=false;
        }
        if (is0k)
        {
            signingIn(email,passw);

        }
    }

    private void signingIn(String email, String passw)
    {
        FirebaseAuth auth=FirebaseAuth.getInstance();
        auth.signInWithEmailAndPassword(email, passw).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) 
            {
              if (task.isSuccessful())
              {
                  Toast.makeText( getApplicationContext(), "signIn is successful", Toast.LENGTH_SHORT).show();
                  finish();
                  startActivity(new Intent(getApplicationContext(),MainActivity.class));
              }
              else 
              {
                  Toast.makeText(getApplicationContext() , "signIn is error"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
              }
            }
        });
        
    }


}













