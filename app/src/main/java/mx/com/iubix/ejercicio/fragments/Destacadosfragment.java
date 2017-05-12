package mx.com.iubix.ejercicio.fragments;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import mx.com.iubix.ejercicio.R;
import mx.com.iubix.ejercicio.adapters.CancionesAdapter;
import mx.com.iubix.ejercicio.models.Cancion;

public class Destacadosfragment extends Fragment {
    ArrayList<Cancion> dataSet;

    public Destacadosfragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_destacadosfragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        final String URL = "http://servicios.ine.es/wstempus/js/ES/CLASIFICACIONES?page=1";

        RequestQueue queue = Volley.newRequestQueue(getActivity());

        final ProgressDialog progressDialog = ProgressDialog.show(getActivity(),
                "Espere porfavor","Estamos atendiendo su peticion");

        JsonArrayRequest req = new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {

            @Override
            public void onResponse(JSONArray response) {
                Log.e("Valor del nombre: ",JsontoArray(response).get(0).getSongName());
                progressDialog.cancel();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.cancel();
            }
        });


        queue.add(req);

        ArrayList<Cancion> canciones = new ArrayList<Cancion>();

        canciones.add(new Cancion("Rock and Buttom","King Krule",4));
        canciones.add(new Cancion("Atrevete","Cafe Tacva",2));
        canciones.add(new Cancion("Give it up!","Hawaiiaii",1));

        RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.rvDestacado);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new CancionesAdapter(canciones, R.layout.row_canciones));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }

    public ArrayList<Cancion> JsontoArray (JSONArray response ){
        ArrayList<Cancion> aux = new ArrayList<Cancion>();

        for(int i = 0 ; i < response.length() ; i++){
            try{

                JSONObject jsonObject = (JSONObject)response.get(i);

                aux.add(new Cancion(jsonObject.getString("songName"),
                                    jsonObject.getString("songArtist"),
                                    4));
            }catch (Exception e){

            }

        }
        return aux;
    }

}
