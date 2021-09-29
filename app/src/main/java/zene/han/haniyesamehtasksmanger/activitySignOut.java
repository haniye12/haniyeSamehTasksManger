package zene.han.haniyesamehtasksmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class activitySignOut extends AppCompatActivity {
    private TextInputEditText elEmail,elPassword,elRePassword,elPhone,elFullName;
    private Button save1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_out);

        elEmail=findViewById(R.id.elEmail);
        elPassword=findViewById(R.id.elPassword);
        elRePassword=findViewById(R.id.elRePassword);
        elPhone=findViewById(R.id.elPhone);
        elFullName=findViewById(R.id.elFullName);
        save1=findViewById(R.id.save1);
    }
}