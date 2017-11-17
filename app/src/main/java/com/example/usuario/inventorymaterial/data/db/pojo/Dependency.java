package com.example.usuario.inventorymaterial.data.db.pojo;

import java.util.Comparator;

/**
 * Created by mamorky on 25/10/17.
 */

public class Dependency implements Comparable{
    private int ID;
    private String name;
    private String shortname;
    private String description;

    public Dependency(int ID, String name, String shortname, String description) {
        this.ID = ID;
        this.name = name;
        this.shortname = shortname;
        this.description = description;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Dependency{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", shortname='" + shortname + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return name.compareTo(((Dependency)o).getName());
    }

    class DependencyComparator implements Comparator<Dependency> {
        @Override
        public int compare(Dependency d1, Dependency d2) {
            return d1.getShortname().compareTo(d2.getShortname());
        }
    }
}
