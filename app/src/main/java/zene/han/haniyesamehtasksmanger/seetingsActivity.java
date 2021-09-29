package zene.han.haniyesamehtasksmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class seetingsActivity extends AppCompatActivity {
    private TextView textView2;
    private Button button4,button5;
    private ToggleButton tb2;
    private RadioGroup radioGroup;
    private RadioButton rd1,rd2,rd3;
    private Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seetings);
        textView2=findViewById(R.id.textView2);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        tb2=findViewById(R.id.tb2);
        radioGroup=findViewById(R.id.radioGroup);
        rd1=findViewById(R.id.rd1);
        rd2=findViewById(R.id.rd2);
        rd3=findViewById(R.id.rd3);
        switch1=findViewById(R.id.switch1);
    }
}