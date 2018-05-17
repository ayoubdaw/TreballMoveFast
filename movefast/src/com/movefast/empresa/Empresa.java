package com.movefast.empresa;

public class Empresa {

    private boolean descompte;
    private String cif;
    private String nomEmpresa;

    // CONSTRUCTOR DE EMPRESA
    public Empresa(boolean descompte, String cif, String nomEmpresa) {
        this.descompte = descompte;
        this.cif = cif;
        this.nomEmpresa = nomEmpresa;
    }
    
    //GETTERS I SETTERS DE EMPRESA
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public boolean isDescompte() {
        return descompte;
    }

    public void setDescompte(boolean descompte) {
        this.descompte = descompte;
    }


    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

}
