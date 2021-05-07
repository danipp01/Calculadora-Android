package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {
    String oper = "+";
    String ultimoNumero = "";
    EditText edit;
    Boolean operacionNueva = true;

    @SuppressLint("WrongViewCast")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        edit = findViewById(R.id.textView2);
    }
    public void numeros (View view){
        if(operacionNueva)
            edit.setText("");
        operacionNueva = false;
        String numero = edit.getText ().toString();
        switch (view.getId()){
            case R.id.N0:
                numero += "0";
                break;
            case R.id.N1:
                numero += "1";
                break;
            case R.id.N2:
                numero += "2";
                break;
            case R.id.N3:
                numero += "3";
                break;
            case R.id.N4:
                numero += "4";
                break;
            case R.id.N5:
                numero += "5";
                break;
            case R.id.N6:
                numero += "6";
                break;
            case R.id.N7:
                numero += "7";
                break;
            case R.id.N8:
                numero += "8";
                break;
            case R.id.N9:
                numero += "9";
                break;
        }

        edit.setText(numero);
    }

    public void Operaciones (View view){
        operacionNueva = true;
        ultimoNumero = edit.getText().toString();
        switch (view.getId()){
            case R.id.Division: oper = "/";
                break;
            case R.id.Resta: oper = "-";
                break;
            case R.id.Suma: oper = "+";
                break;
            case R.id.Multiplicacion: oper = "*";
                break;
        }
    }

    public void Resultado (View view){
        String nuevoNumero = edit.getText().toString();
        double resultado = 0.0;
        switch (oper){
            case "+":
                resultado = Double.parseDouble(ultimoNumero) + Double.parseDouble(nuevoNumero);
                break;
            case "-":
                resultado = Double.parseDouble(ultimoNumero) - Double.parseDouble(nuevoNumero);
                break;
            case "*":
                resultado = Double.parseDouble(ultimoNumero) * Double.parseDouble(nuevoNumero);
                break;
            case "/":
                resultado = Double.parseDouble(ultimoNumero) / Double.parseDouble(nuevoNumero);
                break;
        }
        edit.setText(resultado + "");
    }

    public void Borrar (View view){
        edit.setText("0");
        operacionNueva = true;

    }
}