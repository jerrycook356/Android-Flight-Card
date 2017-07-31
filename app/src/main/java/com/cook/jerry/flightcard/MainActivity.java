package com.cook.jerry.flightcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.cook.jerry.flightcard.db.FlightDbHelper;

public class MainActivity extends AppCompatActivity {
    private static final int CARD_ENTRY = 1;
    private static String Tag = "activity_main";
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
    String passenger18 = "";
    String passenger19 = "";
    String passenger20 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        helper = new FlightDbHelper(this);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.add_flight_card:
                Intent intent = new Intent(this,  FlightCardEntry.class);
                startActivityForResult(intent,CARD_ENTRY);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
