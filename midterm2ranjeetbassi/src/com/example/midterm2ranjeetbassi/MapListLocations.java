package com.example.midterm2ranjeetbassi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MapListLocations extends Activity {

	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_map_list_locations);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_map_list_locations, menu);
        return true;
    }
}
