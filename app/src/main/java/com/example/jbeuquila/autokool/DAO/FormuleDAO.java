package com.example.jbeuquila.autokool.DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.jbeuquila.autokool.MySQLiteHelper;

public class FormuleDAO {
    private MySQLiteHelper accesBD;

    public FormuleDAO(Context ct){
        accesBD = new MySQLiteHelper(ct);

    }

    public Cursor getToutesLesFormules(){
        SQLiteDatabase db = accesBD.getReadableDatabase();
        Cursor curseur = db.rawQuery("SELECT * FROM FORMULE", null);
        return curseur;
    }
}
