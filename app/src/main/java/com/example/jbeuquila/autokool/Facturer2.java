package com.example.jbeuquila.autokool;

/**
 * Created by jbeuquila on 06/04/2018.
 */

public class Facturer2 {
    private TrancheKM codeTrancheKM;
    private Formule codeFormule;
    private CategorieVehicule codeCategorie;
    private double tarifKM;

    public Formule getCodeFormule() {
        return codeFormule;
    }

    public CategorieVehicule getCodeCategorie() {
        return codeCategorie;
    }

    public double getTarifKM() {
        return tarifKM;
    }
    public void setCodeTrancheKM(TrancheKM codeTrancheKM) {
        this.codeTrancheKM = codeTrancheKM;
    }

    public void setCodeFormule(Formule codeFormule) {
        this.codeFormule = codeFormule;
    }

    public void setCodeCategorie(CategorieVehicule codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    public void setTarifKM(double tarifKM) {
        this.tarifKM = tarifKM;
    }

    public TrancheKM getCodeTrancheKM() {

        return codeTrancheKM;
    }

    public Facturer2(TrancheKM codeTrancheKM, Formule codeFormule, CategorieVehicule codeCategorie, double tarifKM) {
        this.codeTrancheKM = codeTrancheKM;
        this.codeFormule = codeFormule;
        this.codeCategorie = codeCategorie;
        this.tarifKM = tarifKM;
    }
}
