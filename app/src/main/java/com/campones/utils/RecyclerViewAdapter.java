package com.campones.utils;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.campones.utils.models.Imagem;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private ArrayList<Imagem> listaImagem;
    private String linksFerramentasGoogle[] = {
            "https://support.google.com/docs/topic/9046002",
            "https://support.google.com/docs/topic/9054603",
            "https://support.google.com/docs/topic/9052835",
            "https://support.google.com/docs/topic/9055404",
            "https://support.google.com/mail/#topic=7065107",
            "https://support.google.com/drive/answer/2424384?hl=pt-BR&ref_topic=14940"};

    public RecyclerViewAdapter (ArrayList<Imagem> listaImagem){
        this.listaImagem = listaImagem;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView imagem;

        public MyViewHolder(final View view){
            super(view);
            imagem = view.findViewById(R.id.ivFG);
        }

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ferramenta_google, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        int img = listaImagem.get(position).getImagem();
        holder.imagem.setImageResource(img);

        holder.imagem.setTag(position);
        holder.imagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int clickPosition = (int) view.getTag();

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(linksFerramentasGoogle[clickPosition]));
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                view.getContext().startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return listaImagem.size();
    }

}
