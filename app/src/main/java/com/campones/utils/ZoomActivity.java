package com.campones.utils;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ZoomActivity extends AppCompatActivity {

    private String urlCapacitacao = "https://success.zoom.us/rec/play/N-ZTeZ1ilIFb0vqaeawDxCg99SojdzW9XtBjg4vSVV2YxHZbwP-0JooL97QTuTcsIsHEe_txT5VnHipn.uZIXuCb0UZPSCU4l?continueMode=true&_x_zm_rtaid=XyNfc8dlQYC1uG0n6uSWtg.1628942468309.b32c2f40a6c107105bb5b72154caa06d&_x_zm_rhtaid=734";
    private String urlCentralAjuda = "https://support.zoom.us/hc/pt-br?_ga=2.142082673.210812303.1628946026-1779077322.1628946026";

    private String linkCriar = "https://support.zoom.us/hc/pt-br/articles/201362613-Como-realizo-uma-reuni%C3%A3o-por-v%C3%ADdeo-";
    private String linkAgendar = "https://support.zoom.us/hc/pt-br/articles/201362413-Agendamento-de-reuni%C3%B5es";
    private String linkIngressar = "https://support.zoom.us/hc/pt-br/articles/201362193-Como-ingressar-em-uma-reuni%C3%A3o";
    private String linkGravar = "https://support.zoom.us/hc/pt-br/articles/201362473-Grava%C3%A7%C3%A3o-local";
    private String linkConvidar = "https://support.zoom.us/hc/pt-br/articles/201362183-Como-convidar-outras-pessoas-para-ingressar-em-uma-reuni%C3%A3o";
    private String linkControles = "https://support.zoom.us/hc/pt-br/articles/201362603-Controles-do-anfitri%C3%A3o-em-uma-reuni%C3%A3o";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);

        ImageView imageView = findViewById(R.id.ivZoomComName);

        Glide.with(this)
                .load("https://www.bubok.pt/blog/wp-content/uploads/logo.jpg")
                .circleCrop()
                .placeholder(R.drawable.ic_baseline_data_usage_24)
                .into(imageView);
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

//    LINKS PARA SAIBA COMO
    public void linkCriar(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(linkCriar));
        startActivity(i);
    }
    public void linkAgendar(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(linkAgendar));
        startActivity(i);
    }
    public void linkIngressar(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(linkIngressar));
        startActivity(i);
    }
    public void linkGravar(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(linkGravar));
        startActivity(i);
    }
    public void linkConvidar(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(linkConvidar));
        startActivity(i);
    }
    public void linkControles(View view){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(linkControles));
        startActivity(i);
    }
}