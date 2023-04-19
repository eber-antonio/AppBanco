package com.example.appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends AppCompatActivity implements View.OnClickListener{
EditText user, pass;
Button btnEntrar, btnRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        user=(EditText) findViewById(R.id.User);
        pass=(EditText) findViewById(R.id.Pass);
        btnEntrar=(Button) findViewById(R.id.btnIngresar);
        btnRegistrar=(Button) findViewById(R.id.btnSucursales);
        btnEntrar.setOnClickListener(this);
        btnRegistrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnIngresar:
                Intent intent =new Intent(Main.this,Inicio.class);
                startActivity(intent);
                break;

            case R.id.btnSucursales:
                Intent i=new Intent(Main.this,Registrar.class);
                startActivity(i);
                break;
        }
    }
}