package com.example.appindividual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InfoFormulario extends AppCompatActivity {

    Button btnSalir;
    TextView txtNombres;
    TextView txtApellidos;
    TextView txtCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_formulario);

        txtNombres = findViewById(R.id.txtNombresInfo);
        txtApellidos = findViewById(R.id.txtApelldiosInfo);
        txtCorreo = findViewById(R.id.txtCorreoInfo);
        btnSalir = findViewById(R.id.btnSalir);

        Bundle recibirDatos = getIntent().getExtras();
        String nombreInfo = recibirDatos.getString("nombre");
        String apellidoInfo = recibirDatos.getString("apellido");
        String correoInfo = recibirDatos.getString("correo");

        txtNombres.setText(nombreInfo);
        txtApellidos.setText(apellidoInfo);
        txtCorreo.setText(correoInfo);


        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //finish();
                //System.exit(0);
                Intent i = new Intent(Intent.ACTION_MAIN);
                i.addCategory(Intent.CATEGORY_HOME);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
            }
        });



    }
}