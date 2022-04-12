package com.campones.utils;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ZoomActivity extends AppCompatActivity {

    private String urlCapacitacao = "https://success.zoom.us/rec/play/N-ZTeZ1ilIFb0vqaeawDxCg99SojdzW9XtBjg4vSVV2YxHZbwP-0JooL97QTuTcsIsHEe_txT5VnHipn.uZIXuCb0UZPSCU4l?continueMode=true&_x_zm_rtaid=XyNfc8dlQYC1uG0n6uSWtg.1628942468309.b32c2f40a6c107105bb5b72154caa06d&_x_zm_rhtaid=734";
    private String urlCentralAjuda = "https://support.zoom.us/hc/pt-br?_ga=2.142082673.210812303.1628946026-1779077322.1628946026";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);
    }

    public void irParaHome(View view){
        finish();
    }

    public void btnCapacitacao(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(urlCapacitacao));
        startActivity(i);
    }
    public void btnCentralAjuda(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(urlCentralAjuda));
        startActivity(i);
    }

}