package com.hsowl18.mo.photodiary.storage;

import android.provider.BaseColumns;

public final class StorageContract {

    private StorageContract() {};

    public static class StorageEntry implements BaseColumns {
        public static final String TABLE_NAME = "picturestorage";
        public static final String NAME = "name";
        public static final String DATE = "date";
        public static final String SHUTTER = "shutter";
        public static final String F = "f";
        public static final String ISO = "iso";
        public static final String GPS_1 = "gps1";
        public static final String GPS_2 = "gps2";
        public static final String TAGS = "tags";

        private static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + StorageEntry.TABLE_NAME + " (" +
                        StorageEntry._ID + " INTEGER PRIMARY KEY, " +
                        StorageEntry.NAME + " CHAR(30), " +
                        StorageEntry.DATE + " DATE, " +
                        StorageEntry.SHUTTER + " DOUBLE, " +
                        StorageEntry.F + " DOUBLE, " +
                        StorageEntry.ISO + " INTEGER, " +
                        StorageEntry.GPS_1 + " DOUBLE, " +
                        StorageEntry.GPS_2 + " DOUBLE, " +
                        StorageEntry.TAGS + " TEXT)";
    }

    private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + StorageEntry.TABLE_NAME;

}
