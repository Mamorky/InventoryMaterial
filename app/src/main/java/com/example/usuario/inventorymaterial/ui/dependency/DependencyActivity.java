package com.example.usuario.inventorymaterial.ui.dependency;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.support.v7.widget.Toolbar;

import com.example.usuario.inventorymaterial.R;
import com.example.usuario.inventorymaterial.adapter.DependencyAdapter;

/**
 * Created by mamorky on 25/10/17.
 */

public class DependencyActivity extends AppCompatActivity{

    //private ArrayAdapter<Dependency> dependencies;
    private DependencyAdapter adapter;
    private ListView listView;
    private FloatingActionButton fab;
    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependency);
        // dependencies = new ArrayAdapter<Dependency>(this,android.R.layout.simple_list_item_1,DependencyRepository.getInstance().getDependencies());
        // getListView().setAdapter(dependencies);//
        listView = (ListView)findViewById(android.R.id.list);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        fab = (FloatingActionButton)findViewById(R.id.fab);

        setSupportActionBar(toolbar);

       coordinatorLayout = (CoordinatorLayout)findViewById(R.id.coordinator);

        adapter = new DependencyAdapter(this);
        listView.setAdapter(adapter);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DependencyActivity.this,AddDependencyActivity.class));
            }
        });
    }
}
