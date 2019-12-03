package com.example.myaudioplayer;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MusicDBHelper extends SQLiteOpenHelper {

    private static final String TAG = "miao";

    private final static String CREATE_MUSIC = "create table music(" +
            "id integer primary key autoincrement," +
            "isPlaying int," +
            "isCollect int," +
            "songName text," +
            "singer text)";

    public MusicDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_MUSIC);
        Log.d(TAG, "onCreate: "+"create database success");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}