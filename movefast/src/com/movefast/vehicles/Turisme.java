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
public class Turisme extends Vehicle {
    
    //atributs
    protected int passatgers;

    //constructor
    public Turisme(int passatgers, String matricula, double preuDia, String tipusCarnet, boolean disponible) {
        super(matricula, preuDia, tipusCarnet, disponible);
        this.passatgers = passatgers;
    }

    //getters & setters passatgers
    public int getPassatgers() {
        return passatgers;
    }

    public void setPassatgers(int passatgers) {
        this.passatgers = passatgers;
    }

}
