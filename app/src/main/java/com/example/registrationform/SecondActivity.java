package com.example.registrationform;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textDisplay = findViewById(R.id.textDisplay);

        Intent intent = getIntent();
        String username = intent.getStringExtra("USERNAME");
        String password = intent.getStringExtra("PASSWORD");
        String confirmPassword = intent.getStringExtra("CONFIRM_PASSWORD");

        textDisplay.setText("Username: " + username + "\nPassword: *********\nConfirm Password: *********");
    }
}
