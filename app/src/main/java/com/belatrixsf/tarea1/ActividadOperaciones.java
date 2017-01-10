package com.belatrixsf.tarea1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActividadOperaciones extends AppCompatActivity {

    private EditText primerNumero;
    private EditText segundoNumero;
    private EditText operador;
    private TextView resultadoOperacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_operaciones);

        Button botonCalcular = (Button) findViewById(R.id.buttonCalcular);
        primerNumero = (EditText) findViewById(R.id.editTextPrimerNumero);
        operador = (EditText) findViewById(R.id.editTextOperador);
        segundoNumero = (EditText) findViewById(R.id.editTextSegundoNumero);
        resultadoOperacion = (EditText) findViewById(R.id.editTextResultado);

        //Botón para ir al activity de lineas
        Button botonLineas = (Button) findViewById(R.id.buttonLineas);
        botonLineas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActividadOperaciones.this, ActividadLineas.class);
                startActivity(i);
            }
        });

    }



    public void calcularNumeros(View v) {

        float numero1 = Float.parseFloat(primerNumero.getText().toString());
        String operador1 = operador.getText().toString().trim();
        float numero2 = Float.parseFloat(segundoNumero.getText().toString());
        float resultado;

        if (Float.isNaN(numero1)||Float.isNaN(numero2)) {
            resultado = 0.0f;
        }
        else {

            switch (operador1) {

                case "+":
                    resultado = numero1 + numero2;
                    break;

                case "-":
                    resultado = numero1 - numero2;
                    break;

                case "*":
                    resultado = numero1 * numero2;
                    break;

                case "/":
                    resultado = numero1 / numero2;
                    break;

                default:
                    resultado = 0.0f;
            }
        }

        resultadoOperacion.setText(Float.toString(resultado));

    }

}
