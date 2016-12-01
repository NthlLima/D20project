package com.example.nathalia.d20project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.*;

public class PersonagemActivity extends AppCompatActivity implements View.OnClickListener {

    private AdapterPersonagem adpNP;
    private Button btnSalvar;
    private EditText editNome;
    private String nome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagem);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        adpNP = new AdapterPersonagem(this);
        editNome  = (EditText)findViewById(R.id.editNome);
        btnSalvar = (Button)findViewById(R.id.btnSalvar);
        btnSalvar.setOnClickListener(this);


    }


    public void onClick(View v) {
        if(v == btnSalvar) {
            nome = editNome.getText().toString();
            adpNP.salvar(nome);
            Intent it = new Intent(this,MainActivity.class);
            startActivityForResult(it, 0);
        }
    }
}
