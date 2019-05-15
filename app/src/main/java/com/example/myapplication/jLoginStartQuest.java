package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class jLoginStartQuest extends AppCompatActivity {
    private Button button;
    private Button button2;
    private EditText user,pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_j_login_start_quest);

        button2 = (Button) findViewById(R.id.start3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = user.getText().toString();
                String pass = user.getText().toString();

                if(username.equals("quest")||pass.equals("123")){
                    Intent i = new Intent (jLoginStartQuest.this, MapsActivity.class);
                    startActivity(i);
                    finish();
                }else{
                    Toast.makeText(jLoginStartQuest.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button = (Button) findViewById(R.id.withoutLog);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = new AlertDialog.Builder(jLoginStartQuest.this)
                        .setTitle("WARNING!")
                        .setMessage("Are you sure you want to continue? If you choose to continue without signing in, Credibility Points (CP) and Experience Points (EXP) will not be granted and lesser amount of payment will be given.")
                        .setPositiveButton("Ok", null)
                        .setNegativeButton("Cancel", null)
                        .show();

                Button positiveBuutton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                positiveBuutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(jLoginStartQuest.this, MapsActivity.class);
                        startActivity(i);
                    }
                });
            }
        });
    }
}
