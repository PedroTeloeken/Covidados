package com.example.covidados2.ui.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.covidados2.ui.Constants.DataBaseConstants


class GuestDataBase(context: Context) : SQLiteOpenHelper(context, NAME, null, VERSION) {

    companion object {
        private const val NAME = "guestdb"
        private const val VERSION = 1
    }


    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(
            "CREATE TABLE" + DataBaseConstants.Guest.DATA_BASE_NAME + "(" +
                    DataBaseConstants.Guest.coluns.ID + "integer primary key autoincrement," +
                    DataBaseConstants.Guest.coluns.NAME + " text," +
                    DataBaseConstants.Guest.coluns.PRESENCE + " integer);"
        )
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

}