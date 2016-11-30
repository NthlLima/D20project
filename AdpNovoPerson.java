package com.example.nathalia.d20project;

import android.support.v7.app.AppCompatActivity;
import android.content.*;


public class AdpNovoPerson extends AppCompatActivity {
    private Personagem person = new Personagem();
    private DBAdapter dbadp;

    public AdpNovoPerson(Context ctx) {
        dbadp = new DBAdapter(ctx);
    }


    public void salvar(String nome){
        person.setNome(nome);
        dbadp.addPerson(person);
        // Colocando no Model(Modelo) os valores e chamando o DBAdapter para salvar no banco de dados
    }

}
