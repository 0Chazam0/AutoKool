package com.example.jbeuquila.autokool.DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.jbeuquila.autokool.MySQLiteHelper;

public class Facturer2DAO {
    private MySQLiteHelper accesBD;

    public Facturer2DAO(Context ct){
        SQLiteDatabase bd = accesBD.getReadableDatabase();

    }

    public Cursor getToutLesTarifsKMFormule(String idFormule){
        SQLiteDatabase db = accesBD.getReadableDatabase();
        Cursor curseur = db.rawQuery("SELECT * FROM FACTURER2 WHERE CODEFORMULE =" + idFormule, null);
        return curseur;
    }
}
