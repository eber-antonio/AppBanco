package com.example.appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Envio el mensaje de Bienvenida
        Toast.makeText(this, "Bienvenido a TreyerBank", Toast.LENGTH_LONG).show();

        //Referencia para controlar la interfaz
        final Button btnIngresar = (Button)findViewById(R.id.btnIngresar);
        final Button btnSucursales = (Button)findViewById(R.id.btnSucursales);

        //Implemento el evento click de Boton Ingresar
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Creo el Intent
                Intent intent = new Intent(MainActivity.this, Main.class);

                //Creo la informacion que se pasara entre las actividades
                Bundle b = new Bundle();

                //Comienzo el activity
                startActivity(intent);
            }

        });

        //Implemento el evento click de Boton Sucursales
        btnSucursales.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Creo el Intent
                Intent intent = new Intent(MainActivity.this, MapsActivityUno.class);

                //Creo la informacion que se pasara entre las actividades
                Bundle b = new Bundle();

                //Comienzo el activity
                startActivity(intent);
            }

        });
    }
}