package com.jorgesoasti.petagram2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    public MascotaAdaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Toolbar miActionBar2 = findViewById(R.id.tlbMiActionBarSecundario);
        setSupportActionBar(miActionBar2);
        getSupportActionBar().setTitle("");
        */

        listaMascotas = findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();

        inicializarAdaptador();
    }

    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){

        mascotas = new ArrayList<>();

        mascotas.add(new Mascota(R.drawable.aisha,"Aisha", "40"));
        mascotas.add(new Mascota(R.drawable.keyla,"Keyla", "35"));
        mascotas.add(new Mascota(R.drawable.tom,"Tom", "29"));
        mascotas.add(new Mascota(R.drawable.amy,"Amy", "27"));
        mascotas.add(new Mascota(R.drawable.coty,"Coty", "22"));
    }
}
