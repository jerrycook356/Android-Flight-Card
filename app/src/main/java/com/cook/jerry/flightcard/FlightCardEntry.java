package com.cook.jerry.flightcard;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.cook.jerry.flightcard.db.FlightDbHelper;

import java.util.ArrayList;




/**
 * Created by jerry on 7/31/2017.
 */

public class FlightCardEntry extends Activity {
    FlightDbHelper helper = new FlightDbHelper(this);
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        overridePendingTransition(R.xml.fadein, R.xml.fadeout);
        setContentView(R.layout.entry_layout);
        setSpinner();
        setPlaneSpinner();
        setPilotSpinner();
    }

    public void setSpinner(){
        Spinner spinner = (Spinner)findViewById(R.id.flightType_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.flight_type_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }
    public void setPlaneSpinner(){
        ArrayList<String> planeArrayList = helper.getPlaneTypes();

        Spinner planeSpinner = (Spinner)findViewById(R.id.planeTypeSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(FlightCardEntry.this,
                android.R.layout.simple_spinner_item, planeArrayList);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        planeSpinner.setAdapter(adapter);
    }
    public void setPilotSpinner(){
        ArrayList<String> pilotList = helper.getPilots();

        Spinner pilotSpinner = (Spinner)findViewById(R.id.pilotSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(FlightCardEntry.this,
                android.R.layout.simple_spinner_item,pilotList);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        pilotSpinner.setAdapter(adapter);
    }

}
