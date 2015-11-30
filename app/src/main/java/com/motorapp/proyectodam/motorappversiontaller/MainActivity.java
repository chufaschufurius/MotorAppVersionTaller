package com.motorapp.proyectodam.motorappversiontaller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.koushikdutta.ion.Ion;
import com.parse.Parse;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProgressBar progressBar=new ProgressBar(getApplicationContext());
        ImageView imageView= (ImageView)findViewById(R.id.imageSplash);
        Ion.with(imageView).load("http://2.bp.blogspot.com/-SBtthYnAjzE/U1eEF9upHSI/AAAAAAAABZ8/bo0pxhnvHOg/s1600/Imagen-animada-Motor-15.gif");

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "rhJjlsANpxGikehq4WLxFR6KI6cQThGnnZy4x1Xo", "0eI1uNLoUIrX6FHVaN0IrSaQcgIjztVzCVYtXBiJ");

//      progressBar.setBackgroundColor("#FFEB3B");
        try {
            Thread.sleep(10);
            new ListaTareasTaller();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void lanzarListaTareas(View view){
        Intent intent= new Intent(this, ListaTareasTaller.class);
        startActivity(intent);
    }

    public void esperar (int segundos) {
        try {
            Thread.sleep (segundos*1000);
        } catch (Exception e) {
// Mensaje en caso de que falle
        }
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
}
