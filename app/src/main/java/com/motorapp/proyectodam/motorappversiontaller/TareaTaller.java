package com.motorapp.proyectodam.motorappversiontaller;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class TareaTaller extends Activity {
    private static final String TAG = "MyActivity";
    Button acabarTarea;
    Button buttons[];
    CheckBox checkBoxes[];
    int i, j;
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea_taller);
        checkBoxes=new CheckBox[10];
        checkBoxes[0]=(CheckBox)findViewById(R.id.checkbox1);
        checkBoxes[1]=(CheckBox)findViewById(R.id.checkbox2);
        checkBoxes[2]=(CheckBox)findViewById(R.id.checkbox3);
        checkBoxes[3]=(CheckBox)findViewById(R.id.checkbox4);
        checkBoxes[4]=(CheckBox)findViewById(R.id.checkbox5);
        checkBoxes[5]=(CheckBox)findViewById(R.id.checkbox6);
        checkBoxes[6]=(CheckBox)findViewById(R.id.checkbox7);
        checkBoxes[7]=(CheckBox)findViewById(R.id.checkbox8);
        checkBoxes[8]=(CheckBox)findViewById(R.id.checkbox9);
        checkBoxes[9]=(CheckBox)findViewById(R.id.checkbox10);

        buttons=new Button[10];
        buttons[0]=(Button)findViewById(R.id.tarea1);
        buttons[1]=(Button)findViewById(R.id.tarea2);
        buttons[2]=(Button)findViewById(R.id.tarea3);
        buttons[3]=(Button)findViewById(R.id.tarea4);
        buttons[4]=(Button)findViewById(R.id.tarea5);
        buttons[5]=(Button)findViewById(R.id.tarea6);
        buttons[6]=(Button)findViewById(R.id.tarea7);
        buttons[7]=(Button)findViewById(R.id.tarea8);
        buttons[8]=(Button)findViewById(R.id.tarea9);
        buttons[9]=(Button)findViewById(R.id.tarea10);

        acabarTarea = (Button) findViewById(R.id.finalizarTarea);
        acabarTarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlert(v);
            }
        });}

        private void openAlert(View view) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setTitle(this.getTitle() + " decision");
            alertDialogBuilder.setMessage("La tarea esta finalizada?");
            // set positive button: Yes message
            alertDialogBuilder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog,int id) {
                    // go to a new activity of the app
                    Intent positveActivity = new Intent(getApplicationContext(),
                            ListaTareasTaller.class);
                    startActivity(positveActivity);
                    for(i=0;i<10;i++){
                        String holaque="hola que pasa que tal"+i;
                        Toast.makeText(getApplicationContext(), holaque, Toast.LENGTH_LONG).show();
                        Log.v(TAG, "******************=" + i);
//                        buttons[i]
                        for (j=0;j<10; j++){
//                        checkBoxes[j].setActivated(true);
                        }
                    }
                }
            });
            // set negative button: No message
            alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog,int id) {
                    // cancel the alert box and put a Toast to the user
                    dialog.cancel();
                    Toast.makeText(getApplicationContext(), "Continua con la tarea...",
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

    public void lanzarPedirPiezas(View view){
        Intent intent= new Intent(this, PedirPiezas.class);
        startActivity(intent);
    }
}


