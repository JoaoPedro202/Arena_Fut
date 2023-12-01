package com.example.arena_fut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Cadastro extends AppCompatActivity {
private Button btd_cadast;
private ImageButton voltar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        btd_cadast = findViewById(R.id.buttoncontinu);

    }
    public void trocarTela(View v){
        Intent i = new Intent(getApplicationContext(), Pag_login.class);
        startActivity(i);


    }
    public void Voltar2(View v){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}