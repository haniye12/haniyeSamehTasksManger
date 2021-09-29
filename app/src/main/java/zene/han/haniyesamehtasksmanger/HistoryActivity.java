package zene.han.haniyesamehtasksmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

public class HistoryActivity extends AppCompatActivity {
    private SearchView sear1;
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        sear1=findViewById(R.id.sear1);
        lista=findViewById(R.id.lista);
    }
}