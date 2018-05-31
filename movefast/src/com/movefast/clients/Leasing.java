/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movefast.clients;

import com.movefast.empresaLeasing.EmpresaLeasing;

/**
 *
 * @author emilio
 */
public class Leasing extends Client {

    private double mensualitat;
    protected EmpresaLeasing empresaLeasing;

    public Leasing(double mensualitat, String dni, String nom, String llinatge, int telefon, String numComptebancari) {
        super(dni, nom, llinatge, telefon, numComptebancari);
        this.mensualitat = mensualitat;
    }

    public double getMensualitat() {
        return mensualitat;
    }

    public void setMensualitat(double mensualitat) {
        this.mensualitat = mensualitat;
    }

    public EmpresaLeasing getEmpresaLeasing() {
        return empresaLeasing;
    }

}
