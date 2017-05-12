package mx.com.iubix.ejercicio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import mx.com.iubix.ejercicio.R;
import mx.com.iubix.ejercicio.models.Amigo;


public class AmigosAdapter extends RecyclerView.Adapter<AmigosAdapter.ViewHolder>{

    private ArrayList<Amigo> amigos;
    private int itemLayout;

    public AmigosAdapter(ArrayList<Amigo> amigos, int itemLayout){
        this.amigos = amigos;
        this.itemLayout = itemLayout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Amigo amigo = amigos.get(position);
        holder.amigoNombre.setText(amigo.getNombre());
        holder.amigoTwitter.setText(amigo.getTwitter());
        holder.ultimaCancion.setText(amigo.getUltimo());

    }

    @Override
    public int getItemCount() {
        return amigos.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView amigoNombre;
        public TextView amigoTwitter;
        public TextView ultimaCancion;

        public ViewHolder(View itemView) {
            super(itemView);

            amigoNombre = (TextView) itemView.findViewById(R.id.nombreAmigo);
            amigoTwitter = (TextView) itemView.findViewById(R.id.twitterAmigo);
            ultimaCancion = (TextView) itemView.findViewById(R.id.utimaCancion);


        }
    }

}
