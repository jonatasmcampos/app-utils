package com.campones.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.campones.utils.models.Imagem;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private ArrayList<Imagem> listaImagem;

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

    }

    @Override
    public int getItemCount() {
        return listaImagem.size();
    }

}
