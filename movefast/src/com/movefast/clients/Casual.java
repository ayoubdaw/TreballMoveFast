/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movefast.clients;

/**
 *
 * @author emilio
 */
public class Casual extends Client {

    private double pagament;

    public Casual(double pagament, String dni, String nom, String llinatge, int telefon, String numComptebancari) {
        super(dni, nom, llinatge, telefon, numComptebancari);
        this.pagament = pagament;
    }

    public double getPagament() {
        return pagament;
    }

    public void setPagament(double pagament) {
        this.pagament = pagament;
    }

}
