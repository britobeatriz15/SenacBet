package com.example.senacbet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.senacbet.DAO.ApostadorDAO;

public class CadastroApostador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_apostador);

        Button buttonSalvarApostador = findViewById(R.id.activity_cadastro_button_cadastrar_apostador);
        buttonSalvarApostador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ApostadorDAO apostadorDAO = new ApostadorDAO();

                EditText nomeApostador = findViewById(R.id.activity_cadastro_nome_do_apostador);
                apostadorDAO.setNomeApostador(nomeApostador.getText().toString());

                EditText saldo = findViewById(R.id.activity_cadastro_saldo);
                apostadorDAO.setSaldo(saldo.getText().toString());

                EditText email = findViewById(R.id.activity_cadastro_email);
                apostadorDAO.setEmail(email.getText().toString());

            }
        });

    }
}