package com.cook.jerry.flightcard.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;

import com.cook.jerry.flightcard.FlightCard;

import java.util.ArrayList;

/**
 * Created by jerry on 7/27/2017.
 */

public class FlightDbHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String  DATABASE_NAME = "flightCardTracker.db";
    private static final String TABLE_NAME = "flightCards";
    public static final String FLIGHTCARDTRACKER_COLUMN_ID = "_id";
    public static final String FLIGHTCARDTRACKER_COLUMN_DATE_OUT = "dateOut";
    public static final String FLIGHTCARDTRACKER_COLUMN_DATE_IN = "dateIn";
    public static final String FLIGHTCARDTRACKER_COLUMN_FLIGHT_TYPE = "flightType";
    public static final String FLIGHTCARDTRACKER_COLUMN_LEASE = "lease";
    public static final String FLIGHTCARDTRACKER_COLUMN_PLANE_TYPE = "planeType";
    public static final String FLIGHTCARDTRACKER_COLUMN_DESTINATION = "destination";
    public static final String FLIGHTCARDTRACKER_COLUMN_CASH_SPENT = "cashSpent";
    public static final String FLIGHTCARDTRACKER_COLUMN_HOBBS_IN = "hobbsIn";
    public static final String FLIGHTCARDTRACKER_COLUMN_HOBBS_OUT= "hobbsOut";
    public static final String FLIGHTCARDTRACKER_COLUMN_TOTAL_HOBBS = "totalHobbs";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_1 = "passenger1";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_2 = "passenger2";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_3 = "passenger3";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_4 = "passenger4";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_5 = "passenger5";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_6 = "passenger6";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_7 = "passenger7";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_8 = "passenger8";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_9 = "passenger9";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_10 = "passenger10";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_11 = "passenger11";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_12 = "passenger12";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_13 = "passenger13";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_14 = "passenger14";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_15 = "passenger15";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_16 = "passenger16";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_17  = "passenger17";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_18  = "passenger18";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_19 = "passenger19";
    public static final String FLIGHTCARDTRACKER_COLUMN_PASSENGER_20 = "passenger20";

    public static final String TABLE_LEASE_NAME = "leaseTable";
    public static final String LEASETABLE_COLUMN_ID = "_id";
    public static final String LEASETABLE_COLUMN_LEASE = "lease";

    public static final String TABLE_PLANES_NAME = "planesTable";
    public static final String PLANESTABLE_COLUMN_ID= "_id";
    public static final String PLANESTABLE_COLUMN_PLANETYPES = "planeTypes";

    public static final String TABLE_PILOT_NAME = "pilotTable";
    public static final String PILOTTABLE_COLUMN_ID = "_id";
    public static final String PILOTTABLE_COLUMN_PILOTS = "pilots";

    private SQLiteDatabase database;


    public FlightDbHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase database){
        String createTable = ("CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "( "
                +FLIGHTCARDTRACKER_COLUMN_ID + " INTEGER PRIMARY KEY, "
                +FLIGHTCARDTRACKER_COLUMN_DATE_OUT + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_DATE_IN + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_FLIGHT_TYPE + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_LEASE + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PLANE_TYPE + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_DESTINATION + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_CASH_SPENT + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_HOBBS_IN + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_HOBBS_OUT + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_TOTAL_HOBBS+ " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_1+ " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_2 + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_3 + " TEXT,"
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_4 + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_5 + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_6 + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_7 + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_8 + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_9 + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_10 + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_11 + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_12 + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_13 + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_14 + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_15 + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_16 + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_17 + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_18 + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_19 + " TEXT, "
                +FLIGHTCARDTRACKER_COLUMN_PASSENGER_20 + " TEXT )");
        database.execSQL(createTable);

        String createPlaneTable = ("CREATE TABLE IF NOT EXISTS " + TABLE_PLANES_NAME + "( "
                +PLANESTABLE_COLUMN_ID + " INTEGER PRIMARY KEY, "
                +PLANESTABLE_COLUMN_PLANETYPES + " TEXT )");
       database.execSQL(createPlaneTable);

        String createLeaseTable = ("CREATE TABLE IF NOT EXISTS " + TABLE_LEASE_NAME + "( "
                +LEASETABLE_COLUMN_ID + " INTEGER PRIMARY KEY, "
                +LEASETABLE_COLUMN_LEASE + " TEXT )");
        database.execSQL(createLeaseTable);

        String createPilotTable = ("CREATE TABLE IF NOT EXISTS " + TABLE_PILOT_NAME + "( "
               +PILOTTABLE_COLUMN_ID + " INTEGER PRIMARY KEY, "
               +PILOTTABLE_COLUMN_PILOTS + " TEXT )");
        database.execSQL(createPilotTable);

        database.execSQL("INSERT INTO "+TABLE_PILOT_NAME + " (pilots) VALUES ('Trever Engler')");
        database.execSQL("INSERT INTO "+TABLE_PILOT_NAME + " (pilots) VALUES ('Ryan Walter')");

        database.execSQL("INSERT INTO "+TABLE_LEASE_NAME + " (lease) VALUES ('SRW, Inc.')");
        database.execSQL("INSERT INTO "+TABLE_LEASE_NAME + " (lease) VALUES ('NorthStar Bank')");
        database.execSQL("INSERT INTO "+TABLE_LEASE_NAME + " (lease) VALUES ('NFGI')");
        database.execSQL("INSERT INTO "+TABLE_LEASE_NAME + " (lease) VALUES ('WMCB')");
        database.execSQL("INSERT INTO "+TABLE_LEASE_NAME + " (lease) VALUES ('Deland Financial Services')");
        database.execSQL("INSERT INTO "+TABLE_LEASE_NAME + " (lease) VALUES ('Gemini Group, Inc.')");

        database.execSQL("INSERT INTO "+TABLE_PLANES_NAME + " (planeTypes) VALUES ('Jet')");
        database.execSQL("INSERT INTO "+TABLE_PLANES_NAME + " (planeTypes) VALUES ('Caravan')");
        database.execSQL("INSERT INTO "+TABLE_PLANES_NAME + " (planeTypes) VALUES ('Caravan B')");
        database.execSQL("INSERT INTO "+TABLE_PLANES_NAME + " (planeTypes) VALUES ('Navajo')");
        database.execSQL("INSERT INTO "+TABLE_PLANES_NAME + " (planeTypes) VALUES ('Baron')");






    }






    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_LEASE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_LEASE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_PILOT_NAME);
        onCreate(db);

    }

    public void saveRecord(String dateOut, String dateIn,String flightType, String lease,
                           String planeType,String destination, String cashSpent,
                           String hobbsIn, String hobbsOut, String totalHobbs,
                            String passenger1, String passenger2, String passenger3,
                           String passenger4, String passenger5, String passenger6, String passenger7,
                           String passenger8, String passenger9, String passenger10,
                           String passenger11, String passenger12, String passenger13,
                           String passenger14, String passenger15, String passenger16,
                           String passenger17, String passenger18,String passenger19,
                           String passenger20){
        database = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_DATE_OUT,dateOut);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_DATE_IN,dateIn);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_FLIGHT_TYPE,flightType);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_LEASE,lease);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PLANE_TYPE,planeType);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_DESTINATION,destination);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_CASH_SPENT,cashSpent);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_HOBBS_IN,hobbsIn);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_HOBBS_OUT,hobbsOut);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_TOTAL_HOBBS,totalHobbs);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_1,passenger1);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_2,passenger2);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_3,passenger3);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_4,passenger4);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_5,passenger5);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_6,passenger6);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_7,passenger7);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_8,passenger8);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_9,passenger9);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_10,passenger10);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_11,passenger11);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_12,passenger12);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_13,passenger13);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_14,passenger14);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_15,passenger15);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_16,passenger16);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_17,passenger17);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_18,passenger18);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_19,passenger19);
        contentValues.put(FLIGHTCARDTRACKER_COLUMN_PASSENGER_20,passenger20);
        database.insert(TABLE_NAME,null,contentValues);

    }
    public void savePlaneType(String planeType){
        database = this.getWritableDatabase();
        database= this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(PLANESTABLE_COLUMN_PLANETYPES,planeType);
        database.insert(TABLE_PLANES_NAME,null,contentValues);

    }
   /* public ArrayList<FlightCard> getRecords(){
        database = this.getReadableDatabase();
        Cursor cusor = database.rawQuery("SELECT * FROM "+ TABLE_NAME,null);
        while(cusor != null){

        }
    }*/

    public ArrayList<String> getPlaneTypes(){
        ArrayList<String> planes = new ArrayList();
        database = this.getReadableDatabase();
        Cursor cursor = database.rawQuery("SELECT * FROM " + TABLE_PLANES_NAME,null);

           while(cursor.moveToNext()){
               String plane = cursor.getString(cursor.getColumnIndex("planeTypes"));
               planes.add(plane);
           }

        database.close();
        cursor.close();
        return planes;
    }
    public ArrayList<String> getPilots(){
        ArrayList<String> pilots = new ArrayList();
        database = this.getReadableDatabase();
        Cursor cursor = database.rawQuery("SELECT * FROM "+TABLE_PILOT_NAME,null);

        while(cursor.moveToNext()){
            String pilot = cursor.getString(cursor.getColumnIndex("pilots"));
            pilots.add(pilot);

        }
        database.close();
        cursor.close();
        return pilots;
    }
}
