package zene.han.haniyesamehtasksmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;

public class addTaskActivity extends AppCompatActivity
{
    private TextInputEditText etTitle,etSubject;
    private Spinner spinner;
    private SeekBar seekBar;
    private ImageView imageView;
    private Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        etTitle=findViewById(R.id.etTitle);
        etSubject=findViewById(R.id.etSubject);
        spinner=findViewById(R.id.spinner);
        seekBar=findViewById(R.id.seekBar);
        imageView=findViewById(R.id.imageView);
        btnsave=findViewById(R.id.btnsave);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                validate();
            }
        });

    }

    private void validate()
    {
        String etTv=etTitle.getText().toString();
        String TV2=etSubject.getText().toString();
        int progress=seekBar.getProgress();
        boolean btnsave=true;
        if(etTitle.length()==0)
        {




         }

    }
}