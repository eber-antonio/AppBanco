package com.example.appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity implements View.OnClickListener {

    Button btEditar, btEliminar, btMostrar, btSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        btEditar = (Button)findViewById(R.id.btnEditar);
        btEliminar = (Button)findViewById(R.id.btnEliminar);
        btMostrar = (Button)findViewById(R.id.btnMostrar);
        btSalir = (Button)findViewById(R.id.btnSalir);
        btEditar.setOnClickListener(this);
        btEliminar.setOnClickListener(this);
        btMostrar.setOnClickListener(this);
        btSalir.setOnClickListener(this);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnEditar:
                Intent i = new Intent(Inicio.this, Editar.class);
                startActivity(i);
                break;
            case R.id.btnEliminar:
                daoUsuario dao = new daoUsuario(this);
                dao.deleteUsuario();
                break;
            case R.id.btnMostrar:
                break;
            case R.id.btnSalir:
                finishAffinity();
                Intent salir = new Intent(Inicio.this, Main.class);
                startActivity(salir);

                break;
        }
    }
}