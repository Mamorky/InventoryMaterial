package com.example.usuario.inventoryFragment.ui.dependency;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usuario.inventoryFragment.R;
import com.example.usuario.inventoryFragment.adapter.DependencyAdapter;
import com.example.usuario.inventoryFragment.ui.dependency.presenter.ListDependencyContract;

/**
 * Created by mamorky on 23/11/17.
 */

public class ListDependency extends ListFragment implements ListDependencyContract.View{
    public static final String TAG = "listdependency";
    private ListDependencyContract.Presenter presenter;
    private ListDependencyListener callback;

    private FloatingActionButton fabAdd;

    interface ListDependencyListener {
        void addNewDependency();
    }

    public static ListDependency newInstance(Bundle bundle) {
        ListDependency listDependency = new ListDependency();

        if (bundle != null)
            listDependency.setArguments(bundle);

        return listDependency;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            callback = (ListDependencyListener) activity;
        }
        catch (ClassCastException e){
            throw new ClassCastException(activity.toString()+ " must be implements ListDependencyListener");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list_dependency,container,false);

        fabAdd = (FloatingActionButton)rootView.findViewById(R.id.fab);
        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.addNewDependency();
            }
        });

        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setListAdapter(new DependencyAdapter(getActivity()));
    }

    @Override
    public void setPresenter(ListDependencyContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
