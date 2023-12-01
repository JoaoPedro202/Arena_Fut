package com.example.arena_fut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_entrar,button_criar_cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_criar_cont = findViewById(R.id.button_criar_cont);
        button_entrar = findViewById(R.id.button_entrar);
    }

    public void Trocartela1(View v){
        Intent i = new Intent(getApplicationContext(), Pag_login.class);
        startActivity(i);
    }
    public void Trocartela2(View v){
        Intent i = new Intent(getApplicationContext(), Cadastro.class);
        startActivity(i);


    }
}