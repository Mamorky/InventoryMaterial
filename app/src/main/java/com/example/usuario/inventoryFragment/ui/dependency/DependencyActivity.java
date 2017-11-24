package com.example.usuario.inventoryFragment.ui.dependency;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.usuario.inventoryFragment.R;
import com.example.usuario.inventoryFragment.ui.dependency.presenter.AddEditDependencyPresenter;
import com.example.usuario.inventoryFragment.ui.dependency.presenter.ListDendencyPresenter;

/**
 * Created by mamorky on 25/10/17.
 */

public class DependencyActivity extends AppCompatActivity implements ListDependency.ListDependencyListener{

    private ListDependency listDependency;
    private ListDendencyPresenter listPresenter;

    private AddDependency addeditDependency;
    private AddEditDependencyPresenter addEditDependencyPresenter;

    private Fragment detailDependency;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependency);

        listDependency  = (ListDependency) getFragmentManager().findFragmentByTag(ListDependency.TAG);

        if(listDependency == null){
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            listDependency = ListDependency.newInstance(null);
            fragmentTransaction.add(android.R.id.content,listDependency,ListDependency.TAG);
            fragmentTransaction.commit();
        }

        //2.- Se crea el presentador y se le pasa en el constructor la vista correspondiente, es decir su fragment
        listPresenter = new ListDendencyPresenter(listDependency);

        //3.- Si necesitamos se asigna el presentador a su fragment
        listDependency.setPresenter(listPresenter);
    }

    //Método que se ejecuta cuando se crea una nueva Dependency
    @Override
    public void addNewDependency() {
        FragmentManager fragmentManager = getFragmentManager();

        addeditDependency = (AddDependency) fragmentManager.findFragmentByTag(AddDependency.TAG);

        if(addeditDependency == null){
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            addeditDependency = AddDependency.newInstance(null);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.replace(android.R.id.content,addeditDependency,AddDependency.TAG);
            fragmentTransaction.commit();
        }

        //2.- Se crea el presentador y se le pasa en el constructor la vista correspondiente, es decir su fragment
        addEditDependencyPresenter = new AddEditDependencyPresenter(addeditDependency);

        //3.- Si necesitamos se asigna el presentador a su fragment
        addeditDependency.setPresenter(addEditDependencyPresenter);
    }
}
