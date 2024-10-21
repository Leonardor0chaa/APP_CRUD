package com.example.app_busmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.app_busmap.db.MensagemBanco;

public class Faleconosco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faleconosco);

        EditText duvida = findViewById(R.id.duvida_edit);
        Button enviar = findViewById(R.id.button);

        enviar.setOnClickListener((v) -> {
            MensagemBanco.enviarMensagem(getBaseContext(), duvida.getText().toString());
            abrindo_home(v);
        });

    }

    public void abrindo_perfil(View view) {
        // Lógica para abrir outra Activity ou qualquer outra ação
        Intent intent = new Intent(this, Perfil.class);
        startActivity(intent);
    }
    public void abrindo_home(View view) {
        // Lógica para abrir outra Activity ou qualquer outra ação
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void abrindo_favoritos(View view) {
        // Lógica para abrir outra Activity ou qualquer outra ação
        Intent intent = new Intent(this, Favoritos.class);
        startActivity(intent);
    }
    public void abrindo_faleconosco(View view) {
        // Lógica para abrir outra Activity ou qualquer outra ação
        Intent intent = new Intent(this, Perfil.class);
        startActivity(intent);
    }
}