package com.example.nathalia.d20project;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBase extends SQLiteOpenHelper {

    private static final String NOME_DB = "Personagens";
    private static final int VERSAO_DB = 1;

    public DataBase(Context ctx){
        super(ctx,NOME_DB,null,VERSAO_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table Personagens(_id integer primary key autoincrement, nome text not null);");

    }
    public void onUpgrade(SQLiteDatabase db, int arg1, int arg2){
        db.execSQL("drop table Personagens");
        onCreate(db);
    }


}