package com.example.jbeuquila.autokool.DTO;

import java.util.List;

/**
 * Created by jbeuquila on 06/04/2018.
 */

public class Station {
    private int NumSation;
    private String LieuStation;
    private String VilleStation;
    private int CPStation;
    private List<Vehicule> mesVehicules;

    public int getNumSation() {
        return NumSation;
    }

    public void setNumSation(int numSation) {
        NumSation = numSation;
    }

    public String getLieuStation() {
        return LieuStation;
    }

    public void setLieuStation(String lieuStation) {
        LieuStation = lieuStation;
    }

    public String getVilleStation() {
        return VilleStation;
    }

    public void setVilleStation(String villeStation) {
        VilleStation = villeStation;
    }

    public int getCPStation() {
        return CPStation;
    }

    public void setCPStation(int CPStation) {
        this.CPStation = CPStation;
    }

    public List<Vehicule> getMesVehicules() {
        return mesVehicules;
    }

    public void setMesVehicules(List<Vehicule> mesVehicules) {
        this.mesVehicules = mesVehicules;
    }

    public Station(int numSation, String lieuStation, String villeStation, int CPStation, List<Vehicule> mesVehicules) {
        NumSation = numSation;
        LieuStation = lieuStation;
        VilleStation = villeStation;
        this.CPStation = CPStation;
        this.mesVehicules = mesVehicules;
    }
}
