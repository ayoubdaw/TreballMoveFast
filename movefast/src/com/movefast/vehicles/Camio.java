package com.movefast.vehicles;
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

}

   