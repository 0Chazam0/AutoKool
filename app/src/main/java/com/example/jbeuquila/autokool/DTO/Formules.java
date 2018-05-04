package com.example.jbeuquila.autokool.DTO;

import android.database.Cursor;

import java.util.ArrayList;

public class Formules {
    ArrayList<Formule> Formules;

    public ArrayList<Formule> getFormules(){
        return Formules;
    }

    public void setFormules (Cursor curseur){
        ArrayList<Formule> listeFormules = new ArrayList<Formule>();
        String codeF;
        String libelleF;
        double fraisAdhF;
        double tarifMensuelF;
        String partSocialeF;
        double depotGarantieF;
        double cautionF;

        curseur.moveToFirst();
        while (!curseur.isAfterLast()){
            codeF = curseur.getString(0);
            libelleF = curseur.getString(1);
            fraisAdhF = curseur.getDouble(2);
            tarifMensuelF = curseur.getDouble(3);
            partSocialeF = curseur.getString(4);
            depotGarantieF = curseur.getDouble(5);
            cautionF = curseur.getDouble(6);

            listeFormules.add(new Formule(codeF, libelleF, fraisAdhF, tarifMensuelF, partSocialeF, depotGarantieF, cautionF));
            curseur.moveToNext();
        }
        Formules = listeFormules;
    }

    public Formule rechercheFormule(String unIdFormule){
        for (Formule Formule: Formules){
            if (Formule.getCode() == unIdFormule){
                return Formule;
            }
        }
        return null;
    }

    public Formule getFormule(int unIndex){
        return Formules.get(unIndex);
    }

    public void ajouterFormule(Formule uneFormule){
        Formules.add(uneFormule);
    }

    public int size(){
        return this.Formules.size();
    }

}
