package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class eProfileOfGuest extends AppCompatActivity {
    private Button button;
    EditText editTextName, editTextAge, editTextGender, editTextNum, editTextAd;
    String stringName, stringAge, stringGender, stringNum, stringAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eprofileofguest);
        button = findViewById(R.id.ok);

        button = findViewById(R.id.ok);
        editTextName = findViewById(R.id.txtName);
        editTextAge = findViewById(R.id.txtAge);
        editTextGender = findViewById(R.id.txtGender);
        editTextNum = findViewById(R.id.txtNum);
        editTextAd = findViewById(R.id.txtAd);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();

            }
        });
    }
    public void openProfile(){
        Intent intent = new Intent(this, fPostOfGuest.class);
        stringName = editTextName.getText().toString();
        intent.putExtra("guest name", stringName);

        stringAge = editTextAge.getText().toString();
        intent.putExtra("18", stringAge);

        stringGender = editTextGender.getText().toString();
        intent.putExtra("M", stringGender);

        stringNum = editTextNum.getText().toString();
        intent.putExtra("09", stringNum);

        stringAd = editTextAd.getText().toString();
        intent.putExtra("123", stringAd);

        startActivity(intent);
        finish();
    }
}
