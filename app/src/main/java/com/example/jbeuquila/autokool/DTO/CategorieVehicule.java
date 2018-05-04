package com.example.jbeuquila.autokool.DTO;

import java.util.List;

/**
 * Created by jbeuquila on 06/04/2018.
 */

public class CategorieVehicule {
    private String code;
    private String libelle;
    private List<Vehicule> mesVehicules;

    public List<Vehicule> getMesVehicules() {
        return mesVehicules;
    }

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
