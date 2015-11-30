package com.motorapp.proyectodam.motorappversiontaller;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ListaTareasTaller extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_tareas_taller);
    }
    public void lanzarTarea(View view){
        Intent intent= new Intent(this, TareaTaller.class);
        startActivity(intent);
    }


}
