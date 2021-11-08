package zene.han.haniyesamehtasksmanger;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
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
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener
{
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
        if (item.getItemId() == R.id.mnItmHistory)
        {
            Intent i = new Intent(getApplicationContext(), HistoryActivity.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.mnItmSettings)
        {
            Intent i = new Intent(getApplicationContext(), seetingsActivity.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.mnItmSignOut)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder( this);
            builder.setMessage("Are you sure?") ;
            builder.setCancelable(true);

            builder.setPositiveButton("yes", this);
           builder.setPositiveButton("no",this);
            AlertDialog dialog=builder.create();
            dialog.show();
            Intent i=new Intent(getApplicationContext(),signInActivity.class);
            startActivity(i);



        }

        return true;
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int which)
    {
        if (which==dialogInterface.BUTTON_POSITIVE)
        {
            Toast.makeText(getApplicationContext(), "loging out", Toast.LENGTH_SHORT).show();
            finish();
        }
        if (which==dialogInterface.BUTTON_NEGATIVE)
        {
            Toast.makeText(getApplicationContext(), "Loging out canceled", Toast.LENGTH_SHORT).show();
            dialogInterface.cancel();
        }

    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
