package com.example.usuario.inventorymaterial.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.usuario.inventorymaterial.R;
import com.example.usuario.inventorymaterial.data.db.pojo.Dependency;
import com.example.usuario.inventorymaterial.data.db.repository.DependencyRepository;
import com.github.ivbaranov.mli.MaterialLetterIcon;

/**
 * Created by mamorky on 26/10/17.
 * Es la primera solución no Optimizada
 */

public class DependencyAdapterA extends ArrayAdapter<Dependency> {

    public DependencyAdapterA(Context context) {
        super(context, R.layout.item_dependency, DependencyRepository.getInstance().getDependencies());
    }

    @Override
    public View getView(int position, @Nullable View convertView, ViewGroup parent) {

        MaterialLetterIcon icon;
        TextView txvName;
        TextView txvSortName;
        View view;

        /**Other option
         * LayoutInflater inflater = LayoutInflater.from(getContext());
         * */

        // The Best option

        //1. Obtener el servicio de sistema Layout Inflater en el contexto.
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        //2. Inflar la vista. Crear en memoria el objeto View con todos los widget del xml: item_dependency.xml
        view = inflater.inflate(R.layout.item_dependency,null);

        //3. Inicializar las variables a los objetos ya creados de los widget del xml. ¡¡CUIDADO view.findViewId!!
        icon = (MaterialLetterIcon)view.findViewById(R.id.icon);
        txvName = (TextView) view.findViewById(R.id.txvName);
        txvSortName = (TextView) view.findViewById(R.id.txvSortName);

        //4. Mostrar los datos del ArrayList mediante position
        icon.setLetter(getItem(position).getShortname().substring(0,1));
        txvName.setText(getItem(position).getName());
        txvSortName.setText(getItem(position).getName());

        return view;
    }
}
