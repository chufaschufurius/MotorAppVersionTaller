package com.motorapp.proyectodam.motorappversiontaller;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by CHUFASCHIN on 01/12/2015.
 */
public class DialogTarea extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        final String dialog= "Has finalizado la tarea?";
        final String acept= "aceptar";
        final String cancel= "cancelar";

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(dialog)
                .setPositiveButton(acept, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // FIRE ZE MISSILES!
                    }
                })
                .setNegativeButton(cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }
}

