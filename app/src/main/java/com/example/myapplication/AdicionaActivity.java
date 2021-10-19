package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.example.myapplication.R;

public class AdicionaActivity extends AppCompatActivity {

    private Button btnVoltaLista;

    private Button btnSalva;

    private DatabaseReference mDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adiciona);
        btnVoltaLista = (Button) findViewById(R.id.btnVoltaLista);
        
        btnVoltaLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Volta = new Intent(AdicionaActivity.this, MainActivity.class);
                startActivity(Volta);
            }
        });

        btnSalva = (Button) findViewById(R.id.btnSalvaTarefa);
        btnSalva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase = FirebaseDatabase.getInstance().getReference();
                String dataInicial = ((EditText) findViewById(R.id.etDataInicial)).getText().toString();
                String dataFinal = ((EditText) findViewById(R.id.etDateFinal)).getText().toString();
                String descricao = ((EditText) findViewById(R.id.etDescricao)).getText().toString();
                String titulo = ((EditText) findViewById(R.id.etTitulo)).getText().toString();
                String id = mDatabase.push().getKey();
                Tarefa tarefa = new Tarefa(dataInicial, dataFinal, descricao, titulo, id);
                mDatabase.child("tarefas").child(id).setValue(tarefa);
                Intent Volta = new Intent(AdicionaActivity.this, MainActivity.class);
                startActivity(Volta);
            }
        });
    }
}