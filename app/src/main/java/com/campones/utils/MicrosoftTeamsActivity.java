package com.campones.utils;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MicrosoftTeamsActivity extends AppCompatActivity {

    private String urlInfo = "https://support.microsoft.com/pt-br/topic/criando-participando-e-executando-reuni%C3%B5es-utilizando-o-teams-para-aprendizagem-remota-788d730f-2c7e-4761-a059-c9b3fe87adf7";
    private String urlCentralAjudaMteams = "https://support.microsoft.com/pt-br/teams";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microsoft_teams);
    }

    public void irParaHome(View view){
        finish();
    }

    public void btnInformacoes(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(urlInfo));
        startActivity(i);
    }
    public void btnCentralAjudaMteams(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(urlCentralAjudaMteams));
        startActivity(i);
    }
}