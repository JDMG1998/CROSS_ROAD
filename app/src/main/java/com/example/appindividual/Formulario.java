package com.example.appindividual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Formulario extends AppCompatActivity {

    Button btnEnviar;
    EditText txtNombres;
    EditText txtApellidos;
    EditText txtCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        btnEnviar = findViewById(R.id.btnEnviar);
        txtNombres = findViewById(R.id.txtNombres);
        txtApellidos = findViewById(R.id.txtApellidos);
        txtCorreo = findViewById(R.id.txtCorreo);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle enviarDatos = new Bundle();

                enviarDatos.putString("nombre", txtNombres.getText().toString());
                enviarDatos.putString("apellido", txtApellidos.getText().toString());
                enviarDatos.putString("correo", txtCorreo.getText().toString());

                Intent i = new Intent(Formulario.this, InfoFormulario.class);
                i.putExtras(enviarDatos);
                startActivity(i);

            }
        });

    }

    /*public void enviar(View view){

        txtNombres = findViewById(R.id.txtNombres);
        txtApellidos = findViewById(R.id.txtApellidos);
        txtCorreo = findViewById(R.id.txtCorreo);

        Bundle enviarDatos = new Bundle();
        enviarDatos.putString("nombres", txtNombres.getText().toString());
        enviarDatos.putString("apellidos", txtApellidos.getText().toString());
        enviarDatos.putString("apellidos", txtCorreo.getText().toString());

        Intent i = new Intent(this, InfoFormulario.class);
        i.putExtras(enviarDatos);
        startActivity(i);

    }*/
}