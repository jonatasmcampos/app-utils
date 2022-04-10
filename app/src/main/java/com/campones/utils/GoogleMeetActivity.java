package com.campones.utils;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GoogleMeetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_meet);
    }

    public void irParaHome(View view){
        Intent intentHome = new Intent(this, MainActivity.class);
        startActivity(intentHome);
    }
}