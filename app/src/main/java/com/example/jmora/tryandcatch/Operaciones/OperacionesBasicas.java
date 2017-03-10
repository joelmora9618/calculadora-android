package com.example.jmora.tryandcatch.Operaciones;

import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by JMora on 03/11/2016.
 */

public class OperacionesBasicas {

    public float Suma(EditText Operador1, EditText Operador2)
    {
        float OP1 = Integer.parseInt(Operador1.getText().toString());
        float OP2 = Integer.parseInt(Operador2.getText().toString());

        float suma = OP1 + OP2;

        return suma;
    }

    public float Resta(EditText Operador1, EditText Operador2)
    {
        float OP1 = Integer.parseInt(Operador1.getText().toString());
        float OP2 = Integer.parseInt(Operador2.getText().toString());

        float resta = OP1 - OP2;

        return resta;
    }

    public float Multiplicacion(EditText Operador1, EditText Operador2)
    {
        float OP1 = Integer.parseInt(Operador1.getText().toString());
        float OP2 = Integer.parseInt(Operador2.getText().toString());

        float multiplicacion = OP1 * OP2;

        return multiplicacion;
    }

    public float Divicion(EditText Operador1, EditText Operador2)
    {
        float OP1 = Integer.parseInt(Operador1.getText().toString());
        float OP2 = Integer.parseInt(Operador2.getText().toString());

        float divicion = OP1 / OP2;

        return divicion;
    }
}
