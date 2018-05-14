/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movefast.vehicles;

/**
 *
 * @author emilio
 */
public class Camio extends Vehicle {

    protected int tara;

    //constructor
    public Camio(int tara, String matricula, double preuDia, String tipusCarnet, boolean disponible) {
        super(matricula, preuDia, tipusCarnet, disponible);
        this.tara = tara;
    }

    //getter & setters - tara
    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }
    
    
   
    // to string - ens permet mostrar la informació completa de un objecte, es a dir el valor dels deus atributs.
    @Override
    public String toString() {
        return "Camio{" + '}';
    }

    
    
    
    
}

   