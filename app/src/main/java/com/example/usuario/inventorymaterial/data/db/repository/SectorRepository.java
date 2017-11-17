package com.example.usuario.inventorymaterial.data.db.repository;

import com.example.usuario.inventorymaterial.data.db.pojo.Sector;

import java.util.ArrayList;

/**
 * Created by mamorky on 26/10/17.
 */

public class SectorRepository {
    private ArrayList<Sector> sectors;
    private static SectorRepository sectorRepository;

    static {
        sectorRepository = new SectorRepository();
    }

    private SectorRepository(){
        sectors = new ArrayList<>();
        inicialize();
    }

    private void inicialize(){
        addSector(new Sector(1,"Movilidad","Movi","Sector que se encarga de la movilidad",1,true,true));
        addSector(new Sector(2,"Programacion","PROG","Encargado de la Programación",2,true,true));
        addSector(new Sector(3,"Gestion BADA","BADA","Sector que se encarga de la gestión de las bases de datos",1,false,true));
    }

    public static SectorRepository getInstance(){
        if(sectorRepository == null)
            sectorRepository = new SectorRepository();
        return sectorRepository;
    }

    public void addSector(Sector sector){
        sectors.add(sector);
    }

    public ArrayList<Sector> getSectors(){return sectors;}
}
