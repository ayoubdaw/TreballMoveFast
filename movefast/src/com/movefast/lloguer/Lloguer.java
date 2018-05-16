/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movefast.lloguer;

/**
 *
 * @author ayoub
 */
public class Lloguer {
    
    private int numFactura;
    private String dataLliurament;
    private String dataEntrega;

    public Lloguer(int numFactura, String dataLliurament, String dataEntrega) {
        this.numFactura = numFactura;
        this.dataLliurament = dataLliurament;
        this.dataEntrega = dataEntrega;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public String getDataLliurament() {
        return dataLliurament;
    }

    public void setDataLliurament(String dataLliurament) {
        this.dataLliurament = dataLliurament;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    
    

}
