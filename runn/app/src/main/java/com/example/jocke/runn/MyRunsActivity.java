package com.example.jocke.runn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.maps.model.LatLng;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyRunsActivity extends AppCompatActivity {

    MapsActivity receiveInfo= new MapsActivity();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_runs);



       public class storeInfo () {


            ListView listView = (ListView) findViewById(R.id.listView);

            ArrayList<String> runs = new ArrayList<String>();

            ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, runs);

            listView.setAdapter(arrayAdapter);


        }
    }
}
