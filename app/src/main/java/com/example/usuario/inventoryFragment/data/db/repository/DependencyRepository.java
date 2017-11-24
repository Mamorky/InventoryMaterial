package com.example.usuario.inventoryFragment.data.db.repository;

import com.example.usuario.inventoryFragment.data.db.pojo.Dependency;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by mamorky on 26/10/17.
 */

public class DependencyRepository {

    //Declaración de Variables
    private ArrayList<Dependency> dependencies;
    private static DependencyRepository dependencyRepository;

    //Inicialización
    /** Opción 1
     * Crearlo e inicializarlo a la vez
     * private static DependencyRepository dependencyRepository = new DependencyRepository();*/
    /*Opción 2
    * *Inizializar todos los atributos de ámbito estático o de clase*/
    static {
        dependencyRepository = new DependencyRepository();
    }
    //Métodos
    private DependencyRepository(){
        this.dependencies = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        for (int i = 0; i < 20 ; i++){
            addDependency(new Dependency(1,"1 Ciclo Formativo de Grado Superior","1CFGS","1CFGS Desarrollo de Aplicaciones Multiplataforma"));
            addDependency(new Dependency(2,"2 Ciclo Formativo de Grado Superior","2CFGS","2CFGS Desarrollo de Aplicaciones Multiplataforma"));
        }
    }

    public static DependencyRepository getInstance(){
        if(dependencyRepository == null)
            dependencyRepository = new DependencyRepository();
            return dependencyRepository;
    }

    public void addDependency(Dependency dependency){
        dependencies.add(dependency);
    }

    public ArrayList<Dependency> getDependencies(){
        /**
         * El ArrayList se ordena según el criterio por defecto
         * */
        //Collections.sort(dependencies,new Dependency().getShortname());
        Collections.sort(dependencies);
        return dependencies;
    }
}
