package com.movefast.lloguer;

import java.time.LocalDate;
public class Lloguer {
    
    private int numFactura;
    private LocalDate dateLliurament;
    private LocalDate dateEntrega;
   

    public Lloguer(int numFactura, LocalDate dateLliurament, LocalDate dateEntrega) {
        this.numFactura = numFactura;
        this.dateLliurament = dateLliurament;
        this.dateEntrega = dateEntrega;
    }

    
    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public LocalDate getDateLliurament() {
        return dateLliurament;
    }

    public void setDateLliurament(LocalDate dateLliurament) {
        this.dateLliurament = dateLliurament;
    }
    
    public LocalDate getDateEntrega() {
        return dateEntrega;
    }
}
