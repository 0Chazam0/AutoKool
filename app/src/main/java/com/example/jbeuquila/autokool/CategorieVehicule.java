package com.example.jbeuquila.autokool;

/**
 * Created by jbeuquila on 06/04/2018.
 */

public class CategorieVehicule {
    private String code;
    private String libelle;

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

    public CategorieVehicule(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }
}
