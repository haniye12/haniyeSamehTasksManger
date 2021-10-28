package zene.han.haniyesamehtasksmanger;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener {
    private SearchView searchView2;
    private ListView lstvalltasks;
    private FloatingActionButton floatingB3;


    @SuppressLint("WrongViewCast")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchView2 = findViewById(R.id.searchView2);
        lstvalltasks = findViewById(R.id.lstvalltasks);
        floatingB3 = findViewById(R.id.floatingB3);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.mnItmHistory) {
            Intent i = new Intent(getApplicationContext(), HistoryActivity.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.mnItmSettings) {
            Intent i = new Intent(getApplicationContext(), seetingsActivity.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.mnItmSignOut) {
            Intent i = new Intent(getApplicationContext(), activitySignOut.class);
            startActivity(i);

//            builder.setMessage("Are you sure?") ;
//            builder.setCancelable(true);

        }

        return true;
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

    }
}
