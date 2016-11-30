package com.example.nathalia.d20project;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.ArrayAdapter;



public class DBAdapter {
    private SQLiteDatabase db;

    public DBAdapter(Context ctx) {
        DataBase auxdb = new DataBase(ctx);
        db = auxdb.getWritableDatabase();
    }

    public void addPerson(Personagem person){
        ContentValues data = new ContentValues();
        data.put("nome", person.getNome());
        db.insert("Fichas",null,data);
    }

    public void deletePerson(Personagem person){
        db.delete("Fichas", "_id = "+person.getId(), null);
    }



}
