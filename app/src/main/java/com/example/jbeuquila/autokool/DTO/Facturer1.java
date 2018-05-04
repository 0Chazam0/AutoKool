package com.example.jbeuquila.autokool.DTO;

/**
 * Created by jbeuquila on 06/04/2018.
 */

public class Facturer1 {
    private TrancheHoraire codeTrancheH;
    private Formule codeFormule;
    private CategorieVehicule codeCategorie;
    private double tarifH;

    public TrancheHoraire getCodeTrancheH() {
        return codeTrancheH;
    }

    public Formule getCodeFormule() {
        return codeFormule;
    }

    public CategorieVehicule getCodeCategorie() {
        return codeCategorie;
    }

    public double getTarifH() {
        return tarifH;
    }

    public void setCodeTrancheH(TrancheHoraire codeTrancheH) {
        this.codeTrancheH = codeTrancheH;
    }

    public void setCodeFormule(Formule codeFormule) {
        this.codeFormule = codeFormule;
    }

    public void setCodeCategorie(CategorieVehicule codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    public void setTarifH(double tarifH) {
        this.tarifH = tarifH;
    }

    public Facturer1(TrancheHoraire codeTrancheH, Formule codeFormule, CategorieVehicule codeCategorie, double tarifH) {
        this.codeTrancheH = codeTrancheH;
        this.codeFormule = codeFormule;
        this.codeCategorie = codeCategorie;
        this.tarifH = tarifH;
    }
}
