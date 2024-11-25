package com.example.homeautomation;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class DeviceControlActivity extends AppCompatActivity {

    // UI Elements
    private TextView statusText;
    private Button btnSettings, btnConnect, btnDeviceOn, btnDeviceOff, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_control);

        // Get the device name passed from MainActivity
        String deviceName = getIntent().getStringExtra("device_name");

        // Initialize UI elements
        statusText = findViewById(R.id.statusText);
        btnSettings = findViewById(R.id.btn_settings);
        btnConnect = findViewById(R.id.btn_connect);
        btnDeviceOn = findViewById(R.id.btn_device_on);
        btnDeviceOff = findViewById(R.id.btn_device_off);
        btnBack = findViewById(R.id.btn_back);

        // Set the status text with the device name
        statusText.setText("Controlling: " + deviceName);

        // Settings Button
        btnSettings.setOnClickListener(v -> showDevicePairingDialog());

        // Connect Button
        btnConnect.setOnClickListener(v -> {
            Toast.makeText(DeviceControlActivity.this, "Connecting to Bluetooth...", Toast.LENGTH_SHORT).show();
            statusText.setText("Status: Connected");
        });

        // Turn ON Device Button
        btnDeviceOn.setOnClickListener(v -> {
            Toast.makeText(DeviceControlActivity.this, "Device turned ON!", Toast.LENGTH_SHORT).show();
            statusText.setText("Status: Device ON");
        });

        // Turn OFF Device Button
        btnDeviceOff.setOnClickListener(v -> {
            Toast.makeText(DeviceControlActivity.this, "Device turned OFF!", Toast.LENGTH_SHORT).show();
            statusText.setText("Status: Device OFF");
        });

        // Back Button
        btnBack.setOnClickListener(v -> finish()); // Go back to the previous activity
    }

    private void showDevicePairingDialog() {
        // Sample list of devices (You can replace this with actual device discovery results)
        String[] devices = {"Device 1", "Device 2", "Device 3", "Device 4"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Select a Device to Pair")
                .setItems(devices, (dialog, which) -> {
                    // Handle device selection
                    String selectedDevice = devices[which];
                    Toast.makeText(this, selectedDevice + " selected for pairing!", Toast.LENGTH_SHORT).show();
                    statusText.setText("Status: Pairing with " + selectedDevice);
                })
                .setNegativeButton("Cancel", (dialog, which) -> dialog.dismiss());

        builder.create().show();
    }
}
