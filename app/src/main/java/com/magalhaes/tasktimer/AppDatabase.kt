package com.magalhaes.tasktimer

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

private const val TAG = "AppDatabase"
private const val DATABASE_NAME = "TimeTasker.db"
private const val DATABASE_VERSION = 3

internal class AppDatabase constructor(context: Context): SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    init {
        Log.d(TAG, "AppDatabase: initialising")
    }

    override fun onCreate(p0: SQLiteDatabase?) {
        //CREATE TABLE Tasks (_id INTEGER PRIMARY KEY NOT NULL, Name TEXT NOT NULL, Description TEXT, SortOrder INTEGER);
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}