package com.softulp.tp3;
import com.softulp.tp3.modelo.Pelicula;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.ViewHolder> {
    private List<Pelicula> lista;
    Context context;

    public PeliculaAdapter(List<Pelicula> lista,Context context){

        this.lista=lista;
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Pelicula peli=lista.get(position);
        holder.imagen.setImageResource(peli.getImagen());
        holder.titulo.setText(peli.getTitulo());
        holder.resenia.setText(peli.getResenia());
        holder.boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(context, Activity2.class);
                intent.putExtra("pelicula",peli);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView titulo,resenia;
        ImageView imagen;
        Button boton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo=itemView.findViewById(R.id.tvTitulo);
            resenia=itemView.findViewById(R.id.tvResenia);
            imagen=itemView.findViewById(R.id.ivImagen);
            boton=itemView.findViewById(R.id.btnDetalle);

        }
    }
}

