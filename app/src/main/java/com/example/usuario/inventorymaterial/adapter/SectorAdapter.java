package com.example.usuario.inventorymaterial.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.example.usuario.inventorymaterial.R;
import com.example.usuario.inventorymaterial.pojo.Sector;
import com.example.usuario.inventorymaterial.repository.SectorRepository;

import java.util.ArrayList;

/**
 * Created by mamorky on 30/10/17.
 */

public class SectorAdapter extends RecyclerView.Adapter<SectorAdapter.SectorViewHolder>{

    private ArrayList<Sector> sectors;
    private ArrayList<Sector> sectorsModified;
    private OnSwitchCheckedChangeListener onSwitchCheckedChangeListener;

    public SectorAdapter(){
        sectors = SectorRepository.getInstance().getSectors();
        sectorsModified = new ArrayList<>();
    }

    /**
     * Creará un sector adapter con los datos que se han guardado en sectorModified*/
    public SectorAdapter(ArrayList<Sector> sectorsModified){
        sectors = SectorRepository.getInstance().getSectors();
        this.sectorsModified = sectorsModified;
    }

    @Override
    public SectorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //1. Obtener el servicio de sistema Layout Inflater en el contexto.
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //2. Tenemos que inflar la vista
        View view = inflater.inflate(R.layout.item_sector, null);
        SectorViewHolder sectorViewHolder = new SectorViewHolder(view);
        return  sectorViewHolder;
    }

    @Override
    public void onBindViewHolder(SectorViewHolder sectorViewHolderholder, int position) {
        sectorViewHolderholder.swEnabled.setChecked(sectors.get(position).isEnabled());
        sectorViewHolderholder.txvName.setText(sectors.get(position).getName());
        if(sectors.get(position).isDefaul())
            sectorViewHolderholder.txvSectorDefault.setText(R.string.sectorDescription);
    }

    /**
     * Se crearán tantos elementos SectorViewHolder como elementos haya en el
     * ArrayList definido dentro de la clase.
     * @return Tamaño del ArrayList
     * */
    @Override
    public int getItemCount() {
        return sectors.size();
    }

    public static class SectorViewHolder extends RecyclerView.ViewHolder{
        private Switch swEnabled;
        private TextView txvName;
        private TextView txvSectorDefault;

        public SectorViewHolder(View view) {
            super(view);
            swEnabled = (Switch) view.findViewById(R.id.swEnable);
            txvName = (TextView) view.findViewById(R.id.txvName);
            txvSectorDefault = (TextView) view.findViewById(R.id.txvSectorDescription);
        }
    }

    /**
     * Devuelve el array de los sectores que el usuario ha modificado cuando
     * la activity estaba visible y que no se ha guardado en la base de datos(persistente)
     * @return Arraylist de sectores modificados*/
    public ArrayList<Sector> getSectorsModified(){
        return  sectorsModified;
    }

    class OnSwitchCheckedChangeListener implements CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        }
    }
}
