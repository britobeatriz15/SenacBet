package com.example.senacbet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.senacbet.DAO.TimeDAO;
import com.example.senacbet.listas.ListarTimes;

import java.text.ParseException;

public class MainActivity extends AppCompatActivity {
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cadastroTimes = findViewById(R.id.activity_cadastrar_nome_dos_times);
        cadastroTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CadastroTimes.class);
                startActivity(intent);
            }
        });

         Button cadastroApostador = findViewById(R.id.activity_cadastrar_apostador);

         cadastroApostador.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, CadastroApostador.class);
                 startActivity(intent);
             }
         });

         Button listarTimes = findViewById(R.id.activity_listar_times);

         listarTimes.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, ListarTimes.class);
                 startActivity(intent);
             }
         });
             }

    }



