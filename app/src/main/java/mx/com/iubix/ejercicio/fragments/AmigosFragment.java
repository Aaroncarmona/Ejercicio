package mx.com.iubix.ejercicio.fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import mx.com.iubix.ejercicio.R;
import mx.com.iubix.ejercicio.adapters.AmigosAdapter;
import mx.com.iubix.ejercicio.models.Amigo;

public class AmigosFragment extends Fragment {

    public AmigosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_amigos, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayList<Amigo> amigoArrayList = new ArrayList<Amigo>();

        amigoArrayList.add(new Amigo("Aaron Carmona","@aaroncaronai","King Krule: rock and bottom"));
        amigoArrayList.add(new Amigo("Jose Carmona","@josepineda","Los karnada"));
        amigoArrayList.add(new Amigo("Luis Carmna","@luiscarmona","Hawaiiaii Gremlins"));

        RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.rvAmigos);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new AmigosAdapter(amigoArrayList,R.layout.row_amigos));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
