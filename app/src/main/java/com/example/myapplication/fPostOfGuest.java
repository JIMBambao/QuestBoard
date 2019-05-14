package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class fPostOfGuest extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView textViewName, textViewAge, textViewGender, textViewNum, textViewAd;
    String stringName, stringAge, stringGender, stringNum, stringAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fpostofguest);

        textViewName = findViewById(R.id.lblName);
        textViewAge = findViewById(R.id.lblAge);
        textViewGender = findViewById(R.id.lblGender);
        textViewNum = findViewById(R.id.lblNum);
        textViewAd = findViewById(R.id.lblAd);

        stringName = getIntent().getExtras().getString("guest name");
        textViewName.setText(stringName);

        stringAge = getIntent().getExtras().getString("18");
        textViewAge.setText(stringAge);

        stringGender = getIntent().getExtras().getString("M");
        textViewGender.setText(stringGender);

        stringNum = getIntent().getExtras().getString("09");
        textViewNum.setText(stringNum);

        stringAd = getIntent().getExtras().getString("123");
        textViewAd.setText(stringAd);

        Spinner spinner = findViewById(R.id.diff);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.difficulty, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
