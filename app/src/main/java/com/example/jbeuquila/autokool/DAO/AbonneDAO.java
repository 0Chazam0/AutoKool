package com.example.jbeuquila.autokool.DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.jbeuquila.autokool.MySQLiteHelper;

/**
 * Created by jbeuquila on 06/04/2018.
 */

public class AbonneDAO {
    private MySQLiteHelper accesBD;

    public AbonneDAO(Context ct){
        SQLiteDatabase bd = accesBD.getReadableDatabase();
    
    }
}
