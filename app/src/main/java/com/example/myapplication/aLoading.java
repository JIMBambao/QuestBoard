package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class aLoading extends AppCompatActivity {

    private GifImageView gifImageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aloading);

        gifImageView = (GifImageView) findViewById(R.id.gifContent);
        progressBar = (ProgressBar) findViewById(R.id.pBar);
        progressBar.setVisibility(progressBar.VISIBLE);

        try{
            InputStream inputStream = getAssets().open("tenor.gif");
            byte[] bytes = IOUtils.toByteArray(inputStream);
            gifImageView.setBytes(bytes);
            gifImageView.startAnimation();
        }catch(IOException e){

        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                aLoading.this.startActivity(new Intent(aLoading.this, bLogo.class));
                aLoading.this.finish();
            }
        },5000);
    }
}
