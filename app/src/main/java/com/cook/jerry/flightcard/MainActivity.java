package com.cook.jerry.flightcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cook.jerry.flightcard.db.FlightDbHelper;

public class MainActivity extends AppCompatActivity {
    private FlightDbHelper helper;
    String dateIn = "";
    String dateOut = "";
    String flightType = "";
    String lease = "";
    String planeType = "";
    String destination = "";
    String cashSpent = "";
    String hobbsIn = "";
    String hobbsOut = "";
    String hobbsTotal = "";
    String passenger1 = "";
    String passenger2 = "";
    String passenger3 = "";
    String passenger4 = "";
    String passenger5 = "";
    String passenger6 = "";
    String passenger7 = "";
    String passenger8 = "";
    String passenger9 = "";
    String passenger10 = "";
    String passenger11 = "";
    String passenger12 = "";
    String passenger13 = "";
    String passenger14 = "";
    String passenger15 = "";
    String passenger16 = "";
    String passenger17 = "";
    String pasenger18 = "";
    String passenger19 = "";
    String passenger20 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        helper = new FlightDbHelper(this);
        setContentView(R.layout.activity_main);
        //helper.saveRecord("July 12","July 12","halfDay","lease","planeType","destination","cashSpent",
              //  "hobbsIn","hobbsOut","hobbsTotal","jerry",passenger2,passenger3,passenger4,passenger5,
               // passenger6,passenger7,passenger8,passenger9,passenger10,passenger11,passenger12,
              //  passenger13,passenger14,passenger15,passenger16,passenger17,pasenger18,passenger19,
              //  passenger20);

    }
}
