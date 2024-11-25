package com.example.homeautomation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Array of Bluetooth devices
        String[] devices = {"Device 1", "Device 2", "Device 3", "Device 4", "Device 5"};

        // Reference to the ListView
        ListView deviceList = findViewById(R.id.device_list);

        // Set up an ArrayAdapter to display the devices
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, devices);
        deviceList.setAdapter(adapter);

        // Set an item click listener for the ListView
        deviceList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Open DeviceControlActivity
                Intent intent = new Intent(MainActivity.this, DeviceControlActivity.class);
                intent.putExtra("device_name", devices[position]); // Pass device name
                startActivity(intent);
            }
        });

        // Reference to the FloatingActionButton
        FloatingActionButton addDeviceFab = findViewById(R.id.fab_add_device);

        // Set a click listener for the FAB
        addDeviceFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to AddDeviceActivity
                Intent intent = new Intent(MainActivity.this, AddDeviceActivity.class);
                startActivity(intent);
            }
        });
    }
}
