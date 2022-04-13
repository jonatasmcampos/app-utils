package com.campones.utils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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