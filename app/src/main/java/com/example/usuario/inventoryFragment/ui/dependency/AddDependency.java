package com.example.usuario.inventoryFragment.ui.dependency;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usuario.inventoryFragment.R;
import com.example.usuario.inventoryFragment.ui.dependency.presenter.AddEditDependencyContract;

/**
 * Created by mamorky on 3/11/17.
 */

public class AddDependency extends Fragment implements AddEditDependencyContract.View{
    public static final String TAG = "addeditdependency";
    private AddEditDependencyContract.Presenter presenter;

    public static AddDependency newInstance(Bundle arguments){
        AddDependency addDependency = new AddDependency();
        if(arguments != null){
            addDependency.setArguments(arguments);
        }
        return addDependency;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_addedit_dependency,container,false);
        FloatingActionButton fab = rootView.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        if(getArguments()!=null){}
        return rootView;
    }

    @Override
    public void setPresenter(AddEditDependencyContract.Presenter presenter){
        this.presenter = presenter;
    }
}
