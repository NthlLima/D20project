package com.example.nathalia.d20project;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.content.*;
import android.widget.ArrayAdapter;


public class AdapterPersonagem extends AppCompatActivity {
    private Personagem person = new Personagem();
    private DBAdapter dbadp;

    public AdapterPersonagem(Context ctx) {
        dbadp = new DBAdapter(ctx);
    }


    public void salvar(String nome){
        person.setNome(nome);
        dbadp.addPerson(person);
        // Colocando no Model(Modelo) os valores e chamando o DBAdapter para salvar no banco de dados
    }

    public ArrayAdapter<String> criarLista(Context ctx){
        ArrayAdapter<String> adpLista = new ArrayAdapter<String>(ctx,android.R.layout.simple_list_item_1);

        Cursor c = this.dbadp.loadFichas();

        if(c.getCount() > 0){
            c.moveToFirst();

            do{
                Personagem p = new Personagem();
                p.setNome(c.getString(1));
                p.setId(c.getLong(0));
                String nome = p.getNome();
                adpLista.add(nome);


            } while(c.moveToNext());
        }
        return adpLista;
    }
}
