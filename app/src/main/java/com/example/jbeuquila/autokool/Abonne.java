package com.example.jbeuquila.autokool;

import java.util.Date;

/**
 * Created by jbeuquila on 06/04/2018.
 */

public class Abonne {
    private int num;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String rue;
    private String ville;
    private int codePostal;
    private int tel;
    private int telMobile;
    private String email;
    private int numPermis;
    private Date datePermis;
    private String lieuPermis;
    private boolean paiementAdhesion;
    private boolean paiementCausion;
    private int RIB;
    private Formule maFormule;

    public Formule getMaFormule() {
        return maFormule;
    }

    public void setMaFormule(Formule maFormule) {
        this.maFormule = maFormule;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getTelMobile() {
        return telMobile;
    }

    public void setTelMobile(int telMobile) {
        this.telMobile = telMobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumPermis() {
        return numPermis;
    }

    public void setNumPermis(int numPermis) {
        this.numPermis = numPermis;
    }

    public Date getDatePermis() {
        return datePermis;
    }

    public void setDatePermis(Date datePermis) {
        this.datePermis = datePermis;
    }

    public String getLieuPermis() {
        return lieuPermis;
    }

    public void setLieuPermis(String lieuPermis) {
        this.lieuPermis = lieuPermis;
    }

    public boolean isPaiementAdhesion() {
        return paiementAdhesion;
    }

    public void setPaiementAdhesion(boolean paiementAdhesion) {
        this.paiementAdhesion = paiementAdhesion;
    }

    public boolean isPaiementCausion() {
        return paiementCausion;
    }

    public void setPaiementCausion(boolean paiementCausion) {
        this.paiementCausion = paiementCausion;
    }

    public int getRIB() {
        return RIB;
    }

    public void setRIB(int RIB) {
        this.RIB = RIB;
    }

    public Abonne(int num, String nom, String prenom, Date dateNaissance, String rue,
                  String ville, int codePostal, int tel, int telMobile, String email,
                  int numPermis, Date datePermis, String lieuPermis, boolean paiementAdhesion, boolean paiementCausion, int RIB, Formule maFormule) {
        this.num = num;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
        this.tel = tel;
        this.telMobile = telMobile;
        this.email = email;
        this.numPermis = numPermis;
        this.datePermis = datePermis;
        this.lieuPermis = lieuPermis;
        this.paiementAdhesion = paiementAdhesion;
        this.paiementCausion = paiementCausion;
        this.RIB = RIB;
        this.maFormule = maFormule;
        this.maFormule.getMesAbonnes().add(this);
    }
}
