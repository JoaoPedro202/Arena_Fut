package com.example.arena_fut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Pag_login extends AppCompatActivity {
private ImageButton voltar1;
private Button entrar1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag_login);
        voltar1 = findViewById(R.id.button_voltar);
        entrar1 = findViewById(R.id.but_entrar_login);

    }
public void irLogin(View w){
        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(i);



}
    public void Voltar(View v){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}