package com.example.appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Editar extends AppCompatActivity implements View.OnClickListener{

    EditText user, pass, nombre, apellido;
    Button btnActualizar, btnCancelar;
    daoUsuario dao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editar);

    user = (EditText) findViewById(R.id.EdiUser);
    pass = (EditText) findViewById(R.id.EdiPass);
    nombre = (EditText) findViewById(R.id.EdiNombre);
    apellido = (EditText) findViewById(R.id.EdiApellido);
    btnActualizar = (Button) findViewById(R.id.btnEdiRegistrar);
    btnCancelar = (Button) findViewById(R.id.btnEdiCancelar);
    btnActualizar.setOnClickListener(this);
    btnCancelar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btnEdiRegistrar:
                Usuario u=new Usuario();
                u.setUsuario(user.getText().toString());
                u.setPassword(pass.getText().toString());
                u.setNombre(nombre.getText().toString());
                u.setApellidos(apellido.getText().toString());
                if(!u.isNull()) {
                    Toast.makeText(this, "ERROR: Campos vacios", Toast.LENGTH_SHORT).show();
                } else if (dao.updateUsuario(u)) {
                    Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();
                    Intent i2=new Intent(Editar.this, Main.class);
                    startActivity(i2);
                    finish();

                } else{
                    Toast.makeText(this, "Usuario ya registrado!!!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btnEdiCancelar:
                Intent i=new Intent(Editar.this, Inicio.class);
                startActivity(i);
            finish();
            break;
        }
    }
}