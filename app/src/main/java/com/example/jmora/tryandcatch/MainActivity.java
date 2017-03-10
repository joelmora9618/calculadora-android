package com.example.jmora.tryandcatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jmora.tryandcatch.Operaciones.OperacionesBasicas;

import org.w3c.dom.Text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

     static final double PI = 3.1416;

    EditText etOperador1,
             etOperador2;

    Button btnSumar,
           btnRestar,
           btnMultiplicar,
           btnDividir,
           btnClear,
           btnPI;

    TextView tvResultado;
    TextView tvConfirm;
    OperacionesBasicas funciones;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etOperador1 = (EditText)findViewById(R.id.etOperador1);
        etOperador2 = (EditText)findViewById(R.id.etOperador2);
        tvResultado = (TextView)findViewById(R.id.tvResultado);
        tvConfirm = (TextView)findViewById(R.id.tvConfirm);
        btnSumar = (Button)findViewById(R.id.btnSuma);
        btnRestar = (Button)findViewById(R.id.btnResta);
        btnMultiplicar = (Button)findViewById(R.id.btnMultiplicacion);
        btnDividir = (Button)findViewById(R.id.btnDivicion);
        btnClear = (Button)findViewById(R.id.btnClear);
        btnPI = (Button)findViewById(R.id.btnPI);

        funciones = new OperacionesBasicas();

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float suma = funciones.Suma(etOperador1,etOperador2);
                tvResultado.setText("" + suma);
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               float resta = funciones.Resta(etOperador1,etOperador2);
                tvResultado.setText("" + resta);
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float multiplicacion = funciones.Multiplicacion(etOperador1,etOperador2);
                tvResultado.setText("" + multiplicacion);
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float divicion = funciones.Divicion(etOperador1,etOperador2);
                tvResultado.setText("" + divicion);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etOperador1.setText("");
                etOperador2.setText("");
                tvResultado.setText("");
            }
        });

        btnPI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResultado.setText(""+PI);
            }
        });

    }


}
