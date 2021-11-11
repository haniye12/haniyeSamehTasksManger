package zene.han.haniyesamehtasksmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splachScreenActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach_screen);

        Thread th=new Thread()
        {
            @Override
            public void run()
            {
                //هنا المقطع الذي يعمل بالتزامن مع مقاطع اخرى
                int mss = 3 * 1000;//millisecond
                try {
                    sleep(mss);
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        //Thread 4
        th.start();
    }
}