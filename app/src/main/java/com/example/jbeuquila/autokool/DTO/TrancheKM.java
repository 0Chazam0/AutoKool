package com.example.jbeuquila.autokool.DTO;

/**
 * Created by jbeuquila on 06/04/2018.
 */

public class TrancheKM {
    private String code;
    private double minKm;
    private double maxKm;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getMinKm() {
        return minKm;
    }

    public void setMinKm(double minKm) {
        this.minKm = minKm;
    }

    public double getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(double maxKm) {
        this.maxKm = maxKm;
    }

    public TrancheKM(String code, double minKm, double maxKm) {
        this.code = code;
        this.minKm = minKm;
        this.maxKm = maxKm;
    }
}
