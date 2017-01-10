package com.belatrixsf.tarea1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActividadLineas extends AppCompatActivity {

    private EditText cantidadLineas;
    private TextView lineas;
    private String txtLinea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_lineas);

        Button boton = (Button) findViewById(R.id.buttonImprimirLineas);
        lineas = (TextView) findViewById(R.id.textViewLineas);
        cantidadLineas = (EditText) findViewById(R.id.editTextCantidadLineas);

        //Botón para ir al activity de meses

        Button botonMeses = (Button) findViewById(R.id.buttonMeses);
        botonMeses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActividadLineas.this, ActividadMeses.class);
                startActivity(i);
            }
        });
    }

    public void crearLineas (View v){
        int numeroLineas = Integer.parseInt(cantidadLineas.getText().toString());
        this.txtLinea = "";
        for(int i=1; i<=numeroLineas; i++){
            this.txtLinea += "Linea "+i+"\n";
        }
        lineas.setText(txtLinea);
    }
}
