package com.campones.utils;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MicrosoftTeamsActivity extends AppCompatActivity {

    private String urlInfo = "https://support.microsoft.com/pt-br/topic/criando-participando-e-executando-reuni%C3%B5es-utilizando-o-teams-para-aprendizagem-remota-788d730f-2c7e-4761-a059-c9b3fe87adf7";
    private String urlCentralAjudaMteams = "https://support.microsoft.com/pt-br/teams";

    private String linkAgendarMteams = "https://support.microsoft.com/pt-br/office/agendar-uma-reuni%C3%A3o-no-microsoft-teams-943507a9-8583-4c58-b5d2-8ec8265e04e5";
    private String linkIngressarMteams = "https://support.microsoft.com/pt-br/office/ingressar-em-uma-reuni%C3%A3o-no-teams-1613bb53-f3fa-431e-85a9-d6a91e3468c9";
    private String linkGravarMteams = "https://support.microsoft.com/pt-pt/office/gravar-uma-reuni%C3%A3o-no-teams-34dfbe7f-b07d-4a27-b4c6-de62f1348c24?ui=pt-pt&rs=pt-pt&ad=pt";
    private String linkConvidarMteams = "https://support.microsoft.com/pt-br/office/convidar-pessoas-para-uma-reuni%C3%A3o-no-teams-4bc5981c-446e-4e93-866a-d757466b556a";
    private String linkCompartilharTelaMteams = "https://support.microsoft.com/pt-br/office/compartilhar-conte%C3%BAdo-em-uma-reuni%C3%A3o-no-teams-fcc2bf59-aecd-4481-8f99-ce55dd836ce8";
    private String linkCompartilharSomMteams = "https://support.microsoft.com/pt-br/office/compartilhar-som-do-seu-computador-em-uma-reuni%C3%A3o-teams-ou-evento-ao-vivo-dddede9f-e3d0-4330-873a-fa061a0d8e3b";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microsoft_teams);

        ImageView imageView = findViewById(R.id.ivMteamsComName);

        Glide.with(this).load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkNPDpwIzETYgFOaSEzk2b8l1SNMQKfld6kqVigBtPbe6vz0Hor9HXYpEnc-juReE5J6c&usqp=CAU").into(imageView);
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


    public void linkAgendarMteams(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(linkAgendarMteams));
        startActivity(i);
    }
    public void linkIngressarMteams(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(linkIngressarMteams));
        startActivity(i);
    }
    public void linkGravarMteams(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(linkGravarMteams));
        startActivity(i);
    }
    public void linkConvidarMteams(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(linkConvidarMteams));
        startActivity(i);
    }
    public void linkCompartilharTelaMteams(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(linkCompartilharTelaMteams));
        startActivity(i);
    }
    public void linkCompartilharSomMteams(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(linkCompartilharSomMteams));
        startActivity(i);
    }
}