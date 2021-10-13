package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdicionaActivity extends AppCompatActivity {

    private Button btnVoltaLista;

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
    }
}