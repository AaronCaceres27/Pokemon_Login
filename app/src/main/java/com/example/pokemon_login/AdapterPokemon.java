package com.example.pokemon_login;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterPokemon extends RecyclerView.Adapter<AdapterPokemon.ViewHolderPokemones> {
    public AdapterPokemon(ArrayList<Pokemones> listaPokemones) {
        this.listaPokemones = listaPokemones;
    }

    ArrayList<Pokemones> listaPokemones;
    @NonNull
    @Override
    public ViewHolderPokemones onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);
        return new ViewHolderPokemones(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPokemones holder, int position) {
        holder.EtiNombre.setText(listaPokemones.get(position).getNombre());
        holder.EtiInformacion.setText(listaPokemones.get(position).getDescripcion());
        holder.Foto.setImageResource(listaPokemones.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listaPokemones.size();
    }

    public class ViewHolderPokemones extends RecyclerView.ViewHolder {
        TextView EtiNombre, EtiInformacion;
        ImageView Foto;



        public ViewHolderPokemones(@NonNull View itemView) {
            super(itemView);
            EtiNombre=itemView.findViewById(R.id.nombre);
            EtiInformacion=itemView.findViewById(R.id.info);
            Foto=(ImageView) itemView.findViewById(R.id.imagen);
        }
    }
}
