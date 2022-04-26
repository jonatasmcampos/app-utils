package com.campones.utils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.campones.utils.models.Imagem;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Imagem> listaImagem;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        listaImagem = new ArrayList<>();

        setImagem();
        setAdapter();

        // Verificar se tem internet
        ConnectivityManager cm = (ConnectivityManager) this.getSystemService(this.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnected())
            Toast.makeText(this,"",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"Sem conexão!",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        ImageView ivBanner = findViewById(R.id.ivBanner);
        Glide
                .with(this)
                .load("https://www.agenciasense.com.br/blog/wp-content/uploads/2020/08/o-que-%C3%A9-marketing-10.jpg")
                .into(ivBanner);

        ImageView ivZoom = findViewById(R.id.ivZoom);
        Glide
                .with(this)
                .load("https://bk.ibxk.com.br/2020/03/23/23195500720020.jpg")
                .placeholder(R.drawable.ic_baseline_data_usage_24)
                .into(ivZoom);

        ImageView ivGmeet = findViewById(R.id.ivGmeet);
        Glide
                .with(this)
                .load("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/Google_Meet_icon_%282020%29.svg/2491px-Google_Meet_icon_%282020%29.svg.png")
                .placeholder(R.drawable.ic_baseline_data_usage_24)
                .into(ivGmeet);

        ImageView ivMteams = findViewById(R.id.ivMteams);
        Glide
                .with(this)
                .load("https://br.atsit.in/wp-content/uploads/2021/07/o-microsoft-teams-nao-consegue-carregar-ou-enviar-imagens-no-bate-papo.png")
                .placeholder(R.drawable.ic_baseline_data_usage_24)
                .into(ivMteams);
    }

    public void irParaZoom(View view){
        Intent zoomIntent = new Intent(this, ZoomActivity.class);
        startActivity(zoomIntent);
    }
    public void irParaGoogleMeet(View view){
        Intent zoomIntent = new Intent(this, GoogleMeetActivity.class);
        startActivity(zoomIntent);
    }
    public void irParaMicrosoftTeams(View view){
        Intent zoomIntent = new Intent(this, MicrosoftTeamsActivity.class);
        startActivity(zoomIntent);
    }

    public void setAdapter(){
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(listaImagem);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), RecyclerView.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    public void setImagem(){
        listaImagem.add(new Imagem("https://cdn-icons-png.flaticon.com/512/2991/2991108.png"));
        listaImagem.add(new Imagem("https://www.zohowebstatic.com/sites/default/files/sheet/google-logo.png"));
        listaImagem.add(new Imagem("https://i.pinimg.com/originals/e1/de/30/e1de302a2f649251cbabf4cd9466ba8f.png"));
        listaImagem.add(new Imagem("https://innovatorbrasil.com.br/wp-content/uploads/2015/12/unnamed-1.png"));
        listaImagem.add(new Imagem("https://cdn.icon-icons.com/icons2/2631/PNG/512/gmail_new_logo_icon_159149.png"));
        listaImagem.add(new Imagem("https://ssl.gstatic.com/images/branding/product/2x/hh_drive_96dp.png"));
    }
}