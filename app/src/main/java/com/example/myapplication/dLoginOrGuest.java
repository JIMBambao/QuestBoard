package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class dLoginOrGuest extends AppCompatActivity {
    private Button login;
    private  Button continueAsGuest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dloginorguest);

        login = findViewById(R.id.log);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dLoginOrGuest.this, gLoginGive.class);
                startActivity(intent);
            }
        });

        continueAsGuest = findViewById(R.id.contG);
        continueAsGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(dLoginOrGuest.this, "Connecting...", Toast.LENGTH_SHORT).show();
                Intent i = new Intent (dLoginOrGuest.this, eProfileOfGuest.class);
                startActivity(i);
            }
        });
    }
}
