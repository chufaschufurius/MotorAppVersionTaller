package com.motorapp.proyectodam.motorappversiontaller;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PedirPiezas extends Activity {
    Button acabarPedirPieza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedir_piezas);

        acabarPedirPieza = (Button) findViewById(R.id.acabarPedirPieza);
        acabarPedirPieza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlert(v);
            }
        });}

    private void openAlert(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle(this.getTitle() + " decision");
        alertDialogBuilder.setMessage("Realizar el pedido?");
        // set positive button: Yes message
        alertDialogBuilder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int id) {
                // go to a new activity of the app
                Intent positveActivity = new Intent(getApplicationContext(),
                        ListaTareasTaller.class);
                startActivity(positveActivity);
            }
        });
        // set negative button: No message
        alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int id) {
                // cancel the alert box and put a Toast to the user
                dialog.cancel();
                Toast.makeText(getApplicationContext(), "Continua con el pedido...",
                        Toast.LENGTH_LONG).show();
            }
        });
        // set neutral button: Exit the app message
//            alertDialogBuilder.setNeutralButton("Exit the app",new DialogInterface.OnClickListener() {
//                public void onClick(DialogInterface dialog,int id) {
//                    // exit the app and go to the HOME
//                    SplashScreen.this.finish();
//                }
//            });
        AlertDialog alertDialog = alertDialogBuilder.create();
        // show alert
        alertDialog.show();
    }

}
