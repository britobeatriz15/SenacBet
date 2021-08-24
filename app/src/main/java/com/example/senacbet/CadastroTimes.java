package com.example.senacbet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.senacbet.DAO.TimeDAO;

public class CadastroTimes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_time);

        Button buttonSalvarTimes = findViewById(R.id.acitivity_salvar_time);
        buttonSalvarTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            TimeDAO cadastroTimes = new TimeDAO();

            EditText nomeTime = findViewById(R.id.activity_cadastro_nome_do_time);
            cadastroTimes.setNomeTime(nomeTime.getText().toString());

            EditText cidade = findViewById(R.id.activity_cadastro_cidade);
            cadastroTimes.setCidade(cidade.getText().toString());

            EditText pais = findViewById(R.id.activity_cadastro_pais);
            cadastroTimes.setPais(pais.getText().toString());
            }

            });
    }}