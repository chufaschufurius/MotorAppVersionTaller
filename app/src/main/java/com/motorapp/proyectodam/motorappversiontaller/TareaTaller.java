package com.motorapp.proyectodam.motorappversiontaller;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class TareaTaller extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea_taller);
    }
    public void openDialog1(View view) {
        Dialog dialog = new Dialog(TareaTaller.this);
//        dialog.setContentView(R.layout.dialogbrand_layout);
        dialog.setTitle("Hello");
//        TextView textViewUser = (TextView) dialog.findViewById(R.id.textBrand);
//        textViewUser.setText("Hi");
        dialog.show();
    }

    public void lanzarPedirPiezas(View view){
        Intent intent= new Intent(this, PedirPiezas.class);
        startActivity(intent);
    }
}
