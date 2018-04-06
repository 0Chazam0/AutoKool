package com.example.jbeuquila.autokool;

/**
 * Created by jbeuquila on 06/04/2018.
 */

public class Vehicule {
    private int NumVehicule;
    private String Kilometrage;
    private String NiveauEssence;
    private TypeVehicule typeVehicule;
    private Station maStation;

    public int getNumVehicule() {
        return NumVehicule;
    }

    public void setNumVehicule(int numVehicule) {
        NumVehicule = numVehicule;
    }

    public String getKilometrage() {
        return Kilometrage;
    }

    public void setKilometrage(String kilometrage) {
        Kilometrage = kilometrage;
    }

    public String getNiveauEssence() {
        return NiveauEssence;
    }

    public void setNiveauEssence(String niveauEssence) {
        NiveauEssence = niveauEssence;
    }

    public TypeVehicule getTypeVehicule() {
        return typeVehicule;
    }

    public void setTypeVehicule(TypeVehicule typeVehicule) {
        this.typeVehicule = typeVehicule;
    }

    public Station getMaStation() {
        return maStation;
    }

    public void setMaStation(Station maStation) {
        this.maStation = maStation;
    }

    public Vehicule(int numVehicule, String kilometrage, String niveauEssence, TypeVehicule typeVehicule, Station maStation) {
        NumVehicule = numVehicule;
        Kilometrage = kilometrage;
        NiveauEssence = niveauEssence;
        this.typeVehicule = typeVehicule;
        this.maStation = maStation;
        this.maStation.getMesVehicules().add(this);
    }
}
