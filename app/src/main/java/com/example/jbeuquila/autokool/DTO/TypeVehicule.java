package com.example.jbeuquila.autokool.DTO;

/**
 * Created by jbeuquila on 06/04/2018.
 */

public class TypeVehicule {
    private String code;
    private String libelle;
    private int nbPlace;
    private boolean automatique;
    private CategorieVehicule categorie;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    public boolean isAutomatique() {
        return automatique;
    }

    public void setAutomatique(boolean automatique) {
        this.automatique = automatique;
    }

    public CategorieVehicule getCategorie() {
        return categorie;
    }

    public void setCategorie(CategorieVehicule categorie) {
        this.categorie = categorie;
    }

    public TypeVehicule(String code, String libelle, int nbPlace, boolean automatique, CategorieVehicule categorie) {
        this.code = code;
        this.libelle = libelle;
        this.nbPlace = nbPlace;
        this.automatique = automatique;
        this.categorie = categorie;
    }
}
