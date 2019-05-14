package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class cStartOrGiveQuest extends AppCompatActivity {
    private Button startQuest;
    private  Button giveQuest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cstartorgivequest);

        startQuest = findViewById(R.id.start);
        startQuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cStartOrGiveQuest.this, jLoginStartQuest.class);
                startActivity(intent);
            }
        });

        giveQuest = findViewById(R.id.give);
        giveQuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cStartOrGiveQuest.this, "Connecting...", Toast.LENGTH_SHORT).show();
                Intent i = new Intent (cStartOrGiveQuest.this, dLoginOrGuest.class);
                startActivity(i);
            }
        });
    }
}
