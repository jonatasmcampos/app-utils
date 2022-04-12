package com.campones.utils;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class GoogleMeetActivity extends AppCompatActivity {

    private String urlTreinamento = "https://edu.google.com/intl/ALL_br/teacher-center/training/?modal_active=none";
    private String urlPDF = "https://services.google.com/fh/files/misc/google-meet-toolkit_pt-br.pdf";
    private String urlCentralAjudaGmeet = "https://support.google.com/meet/?hl=pt-BR#topic=7306097";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_meet);
    }

    public void irParaHome(View view){
        finish();
    }

    public void btnTreinamento(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(urlTreinamento));
        startActivity(i);
    }
    public void btnPdf(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(urlPDF));
        startActivity(i);
    }
    public void btnCentralAjudaGmeet(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(urlCentralAjudaGmeet));
        startActivity(i);
    }
}