package com.example.a20190305010_rentnow;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static int DATABASE_VERSION=1;

    public DBHelper(Context context){
        super(context,"register.db",null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String registerSql="create table tb_register ("+
                "_id integer primary key autoincrement,"+
                "username not null,"+
                "email,"+
                "password";

        String loginSql="create table tb_login ("+
                "_id integer primary key autoincrement,"+
                "username not null,"+
                "password";

        db.execSQL(registerSql);
        db.execSQL(loginSql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        if (i1==DATABASE_VERSION){
            db.execSQL("drop table tb_register");
            db.execSQL("drop table tb_login");
            onCreate(db);
        }

    }
}
