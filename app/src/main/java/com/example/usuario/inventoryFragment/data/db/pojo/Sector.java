package com.example.usuario.inventoryFragment.data.db.pojo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by mamorky on 30/10/17.
 */

public class Sector implements Parcelable{
    private int ID;
    private String name;
    private String sortName;
    private String description;
    private int dependencyId;
    private boolean enabled;
    private boolean defaul;

    public Sector(int ID, String name, String sortName, String description, int dependencyId, boolean enabled, boolean defaul) {
        this.ID = ID;
        this.name = name;
        this.sortName = sortName;
        this.description = description;
        this.dependencyId = dependencyId;
        this.enabled = enabled;
        this.defaul = defaul;
    }

    protected Sector(Parcel in) {
        ID = in.readInt();
        name = in.readString();
        sortName = in.readString();
        description = in.readString();
        dependencyId = in.readInt();
        enabled = in.readByte() != 0;
        defaul = in.readByte() != 0;
    }

    public static final Creator<Sector> CREATOR = new Creator<Sector>() {
        @Override
        public Sector createFromParcel(Parcel in) {
            return new Sector(in);
        }

        @Override
        public Sector[] newArray(int size) {
            return new Sector[size];
        }
    };

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

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDependencyId() {
        return dependencyId;
    }

    public void setDependencyId(int dependencyId) {
        this.dependencyId = dependencyId;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isDefaul() {
        return defaul;
    }

    public void setDefaul(boolean defaul) {
        this.defaul = defaul;
    }

    @Override
    public String toString() {
        return "Dependency{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", sortName='" + sortName + '\'' +
                ", description='" + description + '\'' +
                ", dependencyId='" + dependencyId + '\'' +
                ", enabled=" + enabled +
                ", defaul=" + defaul +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(ID);
        dest.writeString(name);
        dest.writeString(sortName);
        dest.writeString(description);
        dest.writeInt(dependencyId);
        dest.writeByte((byte) (enabled ? 1 : 0));
        dest.writeByte((byte) (defaul ? 1 : 0));
    }
}
