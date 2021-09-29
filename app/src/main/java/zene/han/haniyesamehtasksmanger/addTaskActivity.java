package zene.han.haniyesamehtasksmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;

public class addTaskActivity extends AppCompatActivity {
    private TextInputEditText tv,tv2;
    private Spinner spinner;
    private SeekBar seekBar;
    private ImageView imageView;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        tv=findViewById(R.id.tv);
        tv2=findViewById(R.id.tv2);
        spinner=findViewById(R.id.spinner);
        seekBar=findViewById(R.id.seekBar);
        imageView=findViewById(R.id.imageView);
        button3=findViewById(R.id.button3);
    }
}