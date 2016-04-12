package com.example.gabriel.activityciclodevida;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("Activity: Metodo onCreate() chamado");
        setContentView(R.layout.layout_main_activity);
        System.out.println("Activity : Metodo onCreate() Finalizado.");

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

    @Override protected void onStart() {
        super.onStart();
        System.out.println("Activity: Metodo onStart() chamado"); }
    @Override protected void onRestart() {
        super.onRestart();
        System.out.println("Activity: Metodo onRestart() chamado");
    }
    @Override protected void onResume() {
        super.onResume();
        System.out.println("Activity: Metodo onResume() chamado");
    }
    @Override protected void onPause() {
        super.onPause();
        System.out.println("Activity: Metodo onPause() chamado");
    }
    @Override protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        System.out.println("Activity: Metodo onSavedInstanceState() chamado");
    }
    @Override protected void onStop() {
        super.onStop();
        System.out.println("Activity: Metodo onStop() chamado");
    }
    @Override protected void onDestroy() {
        super.onDestroy();
        System.out.println("Activity: Metodo onDestroy() chamado");
    }
}
