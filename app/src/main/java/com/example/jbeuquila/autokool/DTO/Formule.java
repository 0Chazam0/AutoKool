package com.example.jbeuquila.autokool.DTO;

import java.util.List;

/**
 * Created by jbeuquila on 06/04/2018.
 */

public class Formule {
    private String code;
    private String libelle;
    private double fraisAdhesion;
    private  double tarifMensuel;
    private String partSociale;
    private double depotGrantie;
    private double caution;
    private List<Abonne> mesAbonnes;

    public List<Abonne> getMesAbonnes() {
        return mesAbonnes;
    }

    public void setMesAbonnes(List<Abonne> mesAbonnes) {
        this.mesAbonnes = mesAbonnes;
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

    public double getFraisAdhesion() {
        return fraisAdhesion;
    }

    public void setFraisAdhesion(double fraisAdhesion) {
        this.fraisAdhesion = fraisAdhesion;
    }

    public double getTarifMensuel() {
        return tarifMensuel;
    }

    public void setTarifMensuel(double tarifMensuel) {
        this.tarifMensuel = tarifMensuel;
    }

    public String getPartSociale() {
        return partSociale;
    }

    public void setPartSociale(String partSociale) {
        this.partSociale = partSociale;
    }

    public double getDepotGrantie() {
        return depotGrantie;
    }

    public void setDepotGrantie(double depotGrantie) {
        this.depotGrantie = depotGrantie;
    }

    public double getCaution() {
        return caution;
    }

    public void setCaution(double caution) {
        this.caution = caution;
    }

    public Formule(String code, String libelle, double fraisAdhesion, double tarifMensuel, String partSociale, double depotGrantie, double caution) {
        this.code = code;
        this.libelle = libelle;
        this.fraisAdhesion = fraisAdhesion;
        this.tarifMensuel = tarifMensuel;
        this.partSociale = partSociale;
        this.depotGrantie = depotGrantie;
        this.caution = caution;
    }
}
