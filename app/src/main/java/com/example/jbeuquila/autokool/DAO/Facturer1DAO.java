package com.example.jbeuquila.autokool.DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.jbeuquila.autokool.MySQLiteHelper;

public class Facturer1DAO {
    private MySQLiteHelper accesBD;

    public Facturer1DAO(Context ct){
        SQLiteDatabase bd = accesBD.getReadableDatabase();

    }

    public Cursor getToutLesTarifsHFormule(String idFormule){
        SQLiteDatabase db = accesBD.getReadableDatabase();
        Cursor curseur = db.rawQuery("SELECT * FROM FACTURER1 WHERE CODEFORMULE =" + idFormule, null);
        return curseur;
    }
}
