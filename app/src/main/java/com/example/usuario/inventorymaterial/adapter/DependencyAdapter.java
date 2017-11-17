package com.example.usuario.inventorymaterial.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.usuario.inventorymaterial.R;
import com.example.usuario.inventorymaterial.data.db.pojo.Dependency;
import com.example.usuario.inventorymaterial.data.db.repository.DependencyRepository;
import com.github.ivbaranov.mli.MaterialLetterIcon;

import java.util.ArrayList;

/**
 * Created by mamorky on 26/10/17.
 */

public class DependencyAdapter extends ArrayAdapter<Dependency> {

    public DependencyAdapter(@NonNull Context context) {
        super(context, R.layout.item_dependency, new ArrayList<Dependency>(DependencyRepository.getInstance().getDependencies()));
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        DependencyHolder dependencyHolder;

        View view = convertView;

        if (view == null) {
            /**Other option
             * LayoutInflater inflater = LayoutInflater.from(getContext());
             * */

            // The Best option

            //1. Obtener el servicio de sistema Layout Inflater en el contexto.
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);


            //2. Inflar la vista. Crear en memoria el objeto View con todos los widget del xml: item_dependency.xml
            view = inflater.inflate(R.layout.item_dependency, null);
            dependencyHolder = new DependencyHolder();
            dependencyHolder.icon = (MaterialLetterIcon) view.findViewById(R.id.icon);
            dependencyHolder.txvName = (TextView) view.findViewById(R.id.txvName);
            dependencyHolder.txvSortName = (TextView) view.findViewById(R.id.txvSortName);
            view.setTag(dependencyHolder);
        } else
            dependencyHolder = (DependencyHolder) view.getTag();

        //3. Inicializar las variables a los objetos ya creados de los widget del xml. ¡¡CUIDADO view.findViewId!!


        //4. Mostrar los datos del ArrayList mediante position
        dependencyHolder.icon.setLetter(getItem(position).getShortname().substring(0, 1));
        dependencyHolder.txvName.setText(getItem(position).getName());
        dependencyHolder.txvSortName.setText(getItem(position).getName());

        return view;
    }

    class DependencyHolder {
        MaterialLetterIcon icon;
        TextView txvName;
        TextView txvSortName;
    }
}
