package com.campones.utils;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ZoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intentHome = new Intent(this, MainActivity.class);
        startActivity(intentHome);
    }

}