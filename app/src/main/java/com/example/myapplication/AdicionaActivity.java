package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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


        btnSalva = (Button) findViewById(R.id.btnSalvaProd);
        btnSalva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase = FirebaseDatabase.getInstance().getReference();
                String nome = ((EditText) findViewById(R.id.nomeProd)).getText().toString();
                String preco = ((EditText) findViewById(R.id.precoProd)).getText().toString();
                String quantidade = ((EditText) findViewById(R.id.quantidadeProd)).getText().toString();
                String descricao = ((EditText) findViewById(R.id.descricaoProd)).getText().toString();
                String categoria = ((EditText) findViewById(R.id.categoriaProd)).getText().toString();
                String id = mDatabase.push().getKey();
                Produto produto = new Produto(nome, preco, quantidade, descricao, categoria);
                mDatabase.child("produtos").child(id).setValue(produto);
                Intent Volta = new Intent(AdicionaActivity.this, MainActivity.class);
                startActivity(Volta);
            }
        });
    }
}