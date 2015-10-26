package io.github.jlillioja.project0;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void showComingSoonSnackbar(String name, View view) {
        Snackbar.make(view, name + " coming soon!", Snackbar.LENGTH_SHORT).show();
    }

    public void button1Click(View view) {
        showComingSoonSnackbar(getString(R.string.project1name), view);
    }

    public void button2Click(View view) {
        showComingSoonSnackbar(getString(R.string.project2name), view);
    }

    public void button3Click(View view) {
        showComingSoonSnackbar(getString(R.string.project3name), view);
    }

    public void button4Click(View view) {
        showComingSoonSnackbar(getString(R.string.project4name), view);
    }

    public void button5Click(View view) {
        showComingSoonSnackbar(getString(R.string.project5name), view);
    }
}
