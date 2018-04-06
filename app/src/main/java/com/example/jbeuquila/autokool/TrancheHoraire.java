package com.example.jbeuquila.autokool;

/**
 * Created by jbeuquila on 06/04/2018.
 */

public class TrancheHoraire {
    private String code;
    private String duree;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public TrancheHoraire(String code, String duree) {
        this.code = code;
        this.duree = duree;
    }
}
