package com.hsowl18.mo.photodiary.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class StorageDbHelper extends SQLiteOpenHelper {

    private static final String LOG_TAG = StorageDbHelper.class.getSimpleName();

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "PictureStorage.db";

    public static final String SQL_CREATE = "CREATE TABLE ";

    public static final String TABLE_NAME = "pictures_torage";
    public static final String COLUMN_ID = "_id";
    public static final String NAME = "name";
    public static final String DATE = "date";
    public static final String SHUTTER = "shutter";
    public static final String F = "f";
    public static final String ISO = "iso";
    public static final String GPS_1 = "gps1";
    public static final String GPS_2 = "gps2";
    public static final String TAGS = "tags";

    private static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY, " +
                    NAME + " CHAR(80), " +
                    DATE + " DATE, " +
                    SHUTTER + " DOUBLE, " +
                    F + " DOUBLE, " +
                    ISO + " INTEGER, " +
                    GPS_1 + " DOUBLE, " +
                    GPS_2 + " DOUBLE, " +
                    TAGS + " TEXT)";

    public StorageDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Log.d(LOG_TAG, "DbHelper hat die Datenbank " + getDatabaseName() + " erzeugt.");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            Log.d(LOG_TAG, "Die Tabelle wird mit SQL-Befehl: " + SQL_CREATE + " angelegt.");
            db.execSQL(SQL_CREATE);
        } catch (Exception e) {
            Log.e(LOG_TAG, "Fehler beim Anlegen der Tabelle: " + e.getMessage());
        }
        //db.execSQL("ALTER TABLE " + DATABASE_NAME + " ADD COLUMN fring");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        ////db.execSQL();
        //onCreate(db);
    }
}
