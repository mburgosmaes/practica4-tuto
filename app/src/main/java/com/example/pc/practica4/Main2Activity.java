package com.example.pc.practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button btnCalcular;
    EditText campoTexto;
    TextView campoResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

     btnCalcular = findViewById(R.id.btnCalcular);
     campoTexto = findViewById(R.id.campoTexto);
     campoResultado = findViewById(R.id.campoResultado);

     btnCalcular.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            int num = Integer.parseInt(campoTexto.getText().toString());

            int a=0,i; //Variable acumulador de las divisiones.

             for (i=1; i<=num; i++){
                 if (num % i == 0){
                     a++;
                 }
             }
             if (a == 2){
                 campoResultado.setText("Número primo");
             }
             else{
                 campoResultado.setText("Número no primo");
             }
         }
     });
    }
}
