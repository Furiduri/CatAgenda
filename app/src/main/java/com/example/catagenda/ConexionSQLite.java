package com.example.catagenda;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.catagenda.utilidades.UsuariosSQL;

public class ConexionSQLite extends SQLiteOpenHelper {


    public ConexionSQLite(Context context,String name,SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(UsuariosSQL.UP_CREAR_TABLA_USUARIO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(UsuariosSQL.UP_DROP_TABLE);
        onCreate(db);
    }
}
