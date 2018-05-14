/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movefast.vehicles;

/**
 *
 * @author Esteve
 */
public class Vehicle {

    //atributs
    protected String matricula;
    protected double preuDia;
    protected String tipusCarnet;
    protected boolean disponible;
    
    //constructor
    public Vehicle(String matricula, double preuDia, String tipusCarnet, boolean disponible) {
        this.matricula = matricula;
        this.preuDia = preuDia;
        this.tipusCarnet = tipusCarnet;
        this.disponible = disponible;
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

    // to string - ens permet mostrar la informació completa de un objecte, es a dir el valor dels deus atributs.
    @Override
    public String toString() {
        return "Vehicle{" + "matricula=" + matricula + ", preuDia=" + preuDia + ", tipusCarnet=" + tipusCarnet + ", disponible=" + disponible + '}';
    }
    
    
    
    
}
