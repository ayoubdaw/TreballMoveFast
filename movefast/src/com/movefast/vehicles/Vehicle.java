/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movefast.vehicles;

import com.movefast.lloguer.Lloguer;

/**
 *
 * @author Esteve
 */
public class Vehicle {

    //atributs
    private String matricula;
    private double preuDia;
    private String tipusCarnet;
    private boolean disponible;
    private Lloguer lloguer;
    
    //constructor
    public Vehicle(String matricula, double preuDia, String tipusCarnet, boolean disponible) {
        this.matricula = matricula;
        this.preuDia = preuDia;
        this.tipusCarnet = tipusCarnet;
        this.disponible = disponible;
    }

    public Vehicle(String matricula, double preuDia, String tipusCarnet, boolean disponible, Lloguer lloguer) {
        this.matricula = matricula;
        this.preuDia = preuDia;
        this.tipusCarnet = tipusCarnet;
        this.disponible = disponible;
        this.lloguer = lloguer;
    }
    
    

    //getters & setters matricula, preuDia, tipusCarnet, disponible
    public String getMatricula() {
        return matricula;
    }

    public double getPreuDia() {
        return preuDia;
    }

    public String getTipusCarnet() {
        return tipusCarnet;
    }

    public Lloguer getLloguer() {
        return lloguer;
    }
    

    public boolean isDisponible() {
        return disponible;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPreuDia(double preuDia) {
        this.preuDia = preuDia;
    }

    public void setTipusCarnet(String tipusCarnet) {
        this.tipusCarnet = tipusCarnet;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "matricula=" + matricula + ", preuDia=" + preuDia + ", tipusCarnet=" + tipusCarnet + ", disponible=" + disponible + '}';
    }
    
    
      
}
