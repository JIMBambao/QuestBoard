package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class bLogo extends AppCompatActivity {

    private static ImageView first;
    private static ImageView second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blogo);

        first = (ImageView) findViewById(R.id.logo);
        second = (ImageView) findViewById(R.id.company);
        final Animation fadein = AnimationUtils.loadAnimation(this, R.anim.fadein);
        final Animation fadeout = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        first.startAnimation(fadein);
        second.setVisibility(View.INVISIBLE);
        first.startAnimation(fadeout);
        second.startAnimation(fadein);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(bLogo.this, cStartOrGiveQuest.class);
                startActivity(i);
            }
        });
    }
}
