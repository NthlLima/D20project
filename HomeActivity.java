package com.example.nathalia.d20project;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        btnEntrar     = (Button)findViewById(R.id.btnEntrar);
        btnEntrar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v == btnEntrar) {
            Intent it = new Intent(this,MainActivity.class);
            startActivityForResult(it, 0);
        }

    }


    //Implementar o login no final!! Se possível
}
