package zene.han.haniyesamehtasksmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private SearchView searchView2;
    private ListView lstvalltasks;
    private FloatingActionButton floatingB3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchView2=findViewById(R.id.searchView2);
        lstvalltasks=findViewById(R.id.lstvalltasks);
        floatingB3=findViewById(R.id.floatingB3);

    }
}