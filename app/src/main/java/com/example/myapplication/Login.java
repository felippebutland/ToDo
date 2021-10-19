package com.example.myapplication;

import com.example.myapplication.R;
import jdk.internal.org.jline.terminal.MouseEvent.Button;

public class Login {
    private Button cadastrar;
    private Button entrar;
    
    @Override 
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cadastro.class, Login.this);
                startActivity(intent);
            }
        });

        btnLogar = (Button) findViewById(R.id.btnLogar);
        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { 
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
            }
        });
        
    }
}
