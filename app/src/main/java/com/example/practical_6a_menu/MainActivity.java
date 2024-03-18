package com.example.practical_6a_menu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.save) {
            Toast.makeText(this, "Save Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.settings) {
            Toast.makeText(this, "Settings Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.delete) {
            Toast.makeText(this, "Delete Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.profile) {
            Toast.makeText(this, "Profile Selected", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Default", Toast.LENGTH_SHORT).show();
            return super.onOptionsItemSelected(item);
        }
    }
}
