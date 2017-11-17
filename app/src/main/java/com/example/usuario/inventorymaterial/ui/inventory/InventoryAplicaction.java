package com.example.usuario.inventorymaterial.ui.inventory;

import android.app.Application;

import com.example.usuario.inventorymaterial.data.db.pojo.Dependency;

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
