/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movefast.empresa;

public class Empresa {

    private boolean descompte;
    private int cif;
    private String nomEmpresa;

    public Empresa(boolean descompte, int cif, String nomEmpresa) {
        this.descompte = descompte;
        this.cif = cif;
        this.nomEmpresa = nomEmpresa;
    }

    public boolean isDescompte() {
        return descompte;
    }

    public void setDescompte(boolean descompte) {
        this.descompte = descompte;
    }

    public int getCif() {
        return cif;
    }

    public void setCif(int cif) {
        this.cif = cif;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

}
