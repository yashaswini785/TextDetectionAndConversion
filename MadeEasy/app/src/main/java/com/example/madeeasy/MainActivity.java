package com.example.madeeasy;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread startTimer=new Thread() {
            public void run() {
                try {
                    sleep(4000);
                    Intent intent0 = new Intent(MainActivity.this, Detectors.class);
                    startActivity(intent0);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        startTimer.start();
    }
}
















