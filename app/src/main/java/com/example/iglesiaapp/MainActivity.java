package com.example.iglesiaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.iglesiaapp.controladores.usuarioAddController;
import com.example.iglesiaapp.modelos.UsuarioDato;

public class MainActivity extends AppCompatActivity {

    Button btn_gusuario,btn_tabla_usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_gusuario=findViewById(R.id.btn_gusuario);
        btn_tabla_usuario=findViewById(R.id.btn_tabla_usuario);

        btn_gusuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, usuarioAddController.class);
                startActivity(intent);
            }
        });

        btn_tabla_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, usuarioTabla.class);
                startActivity(intent);
            }
        });
    }


}