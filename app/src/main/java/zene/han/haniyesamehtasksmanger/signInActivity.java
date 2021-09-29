package zene.han.haniyesamehtasksmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class signInActivity extends AppCompatActivity {

    private TextInputEditText etEmail,etPassword;
    private Button signin,rester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
        signin=findViewById(R.id.signin);
        rester=findViewById(R.id.rester);
    }
}