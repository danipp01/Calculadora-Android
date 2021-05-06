package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    public class Cuenta {
        double numero1;
        double numero2;
        double resultado;
        char operacion;
        public Cuenta(double numero1, double numero2, char operacion) {
            this.numero1 = numero1;
            this.numero2 = numero2;
            this.operacion = operacion;
        }

        public void Resultado(){
            System.out.println(this.numero1+" "+this.operacion+" "+this.numero2+" = "+this.resultado);

        }

        public class Suma extends Cuenta{

            double suma;

            public Suma(double numero1, double numero2) {

                super(numero1, numero2, '+');
                this.suma = numero1 + numero2;
                this.setResultado(this.suma);
            }
        }

        public class Resta extends Cuenta{

            double resta;

            public Resta(double numero1, double numero2) {

                super(numero1, numero2, '-');
                this.resta = numero1 - numero2;
                this.setResultado(this.resta);
            }
        }

        public class Multiplicacion extends Cuenta{

            double multiplicacion;

            public Multiplicacion(double numero1, double numero2) {

                super(numero1, numero2, '*');
                this.multiplicacion = numero1 * numero2;
                this.setResultado(this.multiplicacion);
            }
        }

        public class Division extends Cuenta{

            double division = 0;

            public Division(double numero1, double numero2) {

                super(numero1, numero2, '/');
                if(numero2==0) System.out.println("¡ERROR! No se puede dividir entre cero");
                else this.div = numero1 / numero2;
                this.setResultado(this.division);
            }
        }
}}