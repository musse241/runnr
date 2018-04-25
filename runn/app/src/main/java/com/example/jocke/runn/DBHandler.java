package com.example.jocke.runn;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;

import static android.content.Context.MODE_PRIVATE;
import static com.example.jocke.runn.DBHandler.DBHelperItem.COLUMN_ID;
import static com.example.jocke.runn.DBHandler.DBHelperItem.COLUMN_JSON_STRING;
import static com.example.jocke.runn.DBHandler.DBHelperItem.TABLE_NAME;

/**
 * Created by Jocke on 2018-04-24.
 */


public class DBHandler extends SQLiteOpenHelper {

    private static final String LOG_TAG = "DBHandler";
    private static final int DATABASE_VERSION = 1;


    public static abstract class DBHelperItem implements BaseColumns {
        public static final String TABLE_NAME = "runs";

        public static final String COLUMN_ID = "id";
        public static final String COLUMN_JSON_STRING = "json_string";
    }

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY " + COMMA_SEP +
                    COLUMN_JSON_STRING + TEXT_TYPE + ")";





    public DBHandler(Context context) {
        super(context, DATABASE_NAME , null, DATABASE_VERSION);
    }




    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        try{



        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
