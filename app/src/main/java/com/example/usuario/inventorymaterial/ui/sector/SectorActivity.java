package com.example.usuario.inventorymaterial.ui.sector;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;

import com.example.usuario.inventorymaterial.R;
import com.example.usuario.inventorymaterial.adapter.SectorAdapter;
import com.example.usuario.inventorymaterial.pojo.Sector;

public class SectorActivity extends AppCompatActivity {

    private RecyclerView recyclerSector;
    private SectorAdapter sectorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sector);
        recyclerSector = (RecyclerView) findViewById(R.id.recyclerSection);
        recyclerSector.setHasFixedSize(true);

        // Para que se visualice el ReciclerView es necesario tener un layoutPadre
        recyclerSector.setLayoutManager(new GridLayoutManager(this,2));

        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        if(savedInstanceState != null){
            sectorAdapter = new SectorAdapter(savedInstanceState.<Sector>getParcelableArrayList(("sector")));
        }
        else{
        }

        sectorAdapter = new SectorAdapter();
        recyclerSector.setAdapter(sectorAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_activity_sector,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putParcelableArrayList("sector",sectorAdapter.getSectorsModified());
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
    }
}
