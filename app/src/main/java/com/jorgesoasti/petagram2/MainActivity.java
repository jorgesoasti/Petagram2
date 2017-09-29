package com.jorgesoasti.petagram2;


import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    public MascotaAdaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setCustomView(R.layout.miactionbar);

        final ImageView img = actionBar.getCustomView().findViewById(R.id.imgLogo);

        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM|ActionBar.DISPLAY_SHOW_HOME);

        /*
        Toolbar miActionBar = findViewById(R.id.tlbMiActionBar);
        setSupportActionBar(miActionBar);
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
        mascotas.add(new Mascota(R.drawable.amy,"Amy", "27"));
        mascotas.add(new Mascota(R.drawable.bernard,"Bernard", "5"));
        mascotas.add(new Mascota(R.drawable.bernie,"Bernie", "20"));
        mascotas.add(new Mascota(R.drawable.clara,"Clara", "15"));
        mascotas.add(new Mascota(R.drawable.coty,"Coty", "22"));
        mascotas.add(new Mascota(R.drawable.keyla,"Keyla", "35"));
        mascotas.add(new Mascota(R.drawable.tom,"Tom", "29"));
    }

    public void irFavoritos(View v){
        Intent intent = new Intent(this, MascotasFavoritas.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;

            case R.id.action_fav:
                startActivity(new Intent(this, MascotasFavoritas.class));
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
