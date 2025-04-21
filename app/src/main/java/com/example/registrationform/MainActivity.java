package com.example.registrationform;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText usernameField, passwordField, confirmPasswordField;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameField = findViewById(R.id.editTextText);
        passwordField = findViewById(R.id.editTextText3);
        confirmPasswordField = findViewById(R.id.editTextTextConfirmPassword);
        submitBtn = findViewById(R.id.btn_sub);

        submitBtn.setOnClickListener(v -> {
            String username = usernameField.getText().toString();
            String password = passwordField.getText().toString();
            String confirmPassword = confirmPasswordField.getText().toString();

            if (password.equals(confirmPassword)) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("USERNAME", username);
                intent.putExtra("PASSWORD", password);
                startActivity(intent);
            } else {
                Toast.makeText(MainActivity.this, "Passwords do not match!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
