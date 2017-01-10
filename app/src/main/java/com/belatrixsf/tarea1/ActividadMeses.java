package com.belatrixsf.tarea1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;


public class ActividadMeses extends AppCompatActivity {

    private TextView texto;
    private EditText textoEditable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_actividad_meses);

        Button boton = (Button) findViewById(R.id.button);
        texto = (TextView) findViewById(R.id.textView);
        textoEditable = (EditText) findViewById(R.id.editText);

        //Botón para ir al activity de operaciones

        Button botonOperaciones = (Button) findViewById(R.id.buttonOperaciones);
        botonOperaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActividadMeses.this, ActividadOperaciones.class);
                startActivity(i);
            }
        });
    }

    public void cambiarMensaje(View v){

        int mes = Integer.parseInt(textoEditable.getText().toString());

        String mesString;
        switch (mes) {
            case 1:  mesString = "Enero";
                break;
            case 2:  mesString = "Febrero";
                break;
            case 3:  mesString = "Marzo";
                break;
            case 4:  mesString = "Abril";
                break;
            case 5:  mesString = "Mayo";
                break;
            case 6:  mesString = "Junio";
                break;
            case 7:  mesString = "Julio";
                break;
            case 8:  mesString = "Agosto";
                break;
            case 9:  mesString = "Setiembre";
                break;
            case 10: mesString = "Octubre";
                break;
            case 11: mesString = "Noviembre";
                break;
            case 12: mesString = "Diciembre";
                break;
            default: mesString = "Mes no valido";
                break;
        }

        texto.setText(mesString);
    }
}
