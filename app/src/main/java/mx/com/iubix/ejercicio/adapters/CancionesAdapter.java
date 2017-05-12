package mx.com.iubix.ejercicio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

import mx.com.iubix.ejercicio.R;
import mx.com.iubix.ejercicio.models.Cancion;

public class CancionesAdapter extends RecyclerView.Adapter<CancionesAdapter.ViewHolder>{
    private ArrayList<Cancion> canciones;
    private int itemLayout;

    public CancionesAdapter(ArrayList<Cancion> canciones , int itemLayout ) {
        this.canciones = canciones;
        this.itemLayout = itemLayout;
    }

    @Override
    public CancionesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(itemLayout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CancionesAdapter.ViewHolder holder, int position) {
        Cancion cancion = canciones.get(position);
        holder.songName.setText(cancion.getSongName());
        holder.songArtist.setText(cancion.getSongArtist());
        holder.stars.setRating(cancion.getStars());
    }

    @Override
    public int getItemCount() {
        return canciones.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView songName;
        TextView songArtist;
        RatingBar stars;

        public ViewHolder(View itemView) {
            super(itemView);

            songName = (TextView) itemView.findViewById(R.id.songName);
            songArtist = (TextView) itemView.findViewById(R.id.songArtist);
            stars = (RatingBar) itemView.findViewById(R.id.stars);

        }
    }
}
