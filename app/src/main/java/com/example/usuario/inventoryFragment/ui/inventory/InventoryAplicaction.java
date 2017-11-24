package com.example.usuario.inventoryFragment.ui.inventory;

import android.app.Application;

import com.example.usuario.inventoryFragment.data.db.pojo.Dependency;

import java.util.ArrayList;

/**
 * Created by mamorky on 25/10/17.
 */

public class InventoryAplicaction extends Application{

    ArrayList<Dependency> dependencies;

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
