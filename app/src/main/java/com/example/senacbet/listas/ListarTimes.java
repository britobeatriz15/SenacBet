package com.example.senacbet.listas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.senacbet.CadastroTimes;
import com.example.senacbet.DAO.TimeDAO;
import com.example.senacbet.MainActivity;
import com.example.senacbet.R;

import java.sql.Time;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ListarTimes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_times);

        List<String> contatos = new ArrayList<>();
        contatos.add("São Paulo");
        contatos.add("Santos");
        contatos.add("Corinthians");
        contatos.add("Flamengo");
        contatos.add("Palmeiras");
    }

    @Override
    protected void onResume() {
        super.onResume();
        ListView view  = findViewById(R.id.activity_lista_times);

        TimeDAO contatoDAO = new TimeDAO();

        view.setAdapter(new ArrayAdapter<Time>(ListarTimes.this,
                 android.R.layout.simple_list_item_1,
                 Integer.parseInt(TimeDAO.listar())));
    }
    }
