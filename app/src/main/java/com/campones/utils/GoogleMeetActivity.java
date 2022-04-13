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

    private String linkCriarGmeet = "https://support.google.com/meet/answer/9302870?hl=pt-BR&co=GENIE.Platform%3DAndroid";
    private String linkIngressarGmeet = "https://support.google.com/meet/answer/9303069?hl=pt-BR&ref_topic=7192926";
    private String linkGravarGmeet = "https://support.google.com/meet/answer/9308681?hl=pt-BR";
    private String linkConvidarGmeet = "https://support.google.com/meet/answer/9303164?hl=pt-BR&ref_topic=7192926";
    private String linkCompartilharGmeet = "https://support.google.com/meet/answer/9308856?hl=pt-BR&co=GENIE.Platform%3DAndroid";

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


    public void linkCriarGmeet(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(linkCriarGmeet));
        startActivity(i);
    }
    public void linkIngressarGmeet(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(linkIngressarGmeet));
        startActivity(i);
    }
    public void linkGravarGmeet(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(linkGravarGmeet));
        startActivity(i);
    }
    public void linkConvidarGmeet(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(linkConvidarGmeet));
        startActivity(i);
    }
    public void linkCompartilharGmeet(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(linkCompartilharGmeet));
        startActivity(i);
    }
}