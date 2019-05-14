package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class gLoginGive extends AppCompatActivity {

    EditText editText, editText1;
    Button button;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_login_give);

        editText = (EditText)findViewById(R.id.editText2);
        editText1 = (EditText) findViewById(R.id.editText6);
        button = (Button) findViewById(R.id.start3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editText.getText().toString();
                String password = editText1.getText().toString();

                if(username.equals("quest")||password.equals("123")){
                    Intent i = new Intent(gLoginGive.this, hProfileOfUser.class);
                    name = editText.getText().toString();
                    i.putExtra("Username", name);
                    startActivity(i);
                    finish();
                }else{
                    Toast.makeText(gLoginGive.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
