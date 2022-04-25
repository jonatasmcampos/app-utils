package com.campones.utils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
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
    }

    @Override
    protected void onStart() {
        super.onStart();

        ImageView ivBanner = findViewById(R.id.ivBanner);
        Glide.with(this).load("https://www.agenciasense.com.br/blog/wp-content/uploads/2020/08/o-que-%C3%A9-marketing-10.jpg").into(ivBanner);

        ImageView ivZoom = findViewById(R.id.ivZoom);
        Glide.with(this).load("https://bk.ibxk.com.br/2020/03/23/23195500720020.jpg").into(ivZoom);

        ImageView ivGmeet = findViewById(R.id.ivGmeet);
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/Google_Meet_icon_%282020%29.svg/2491px-Google_Meet_icon_%282020%29.svg.png").into(ivGmeet);

        ImageView ivMteams = findViewById(R.id.ivMteams);
        Glide.with(this).load("https://br.atsit.in/wp-content/uploads/2021/07/o-microsoft-teams-nao-consegue-carregar-ou-enviar-imagens-no-bate-papo.png").into(ivMteams);
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
        listaImagem.add(new Imagem(R.drawable.gdocs));
        listaImagem.add(new Imagem(R.drawable.gplanilhas));
        listaImagem.add(new Imagem(R.drawable.gslides));
        listaImagem.add(new Imagem(R.drawable.gforms));
        listaImagem.add(new Imagem(R.drawable.gmail));
        listaImagem.add(new Imagem(R.drawable.gdrive));
    }
}