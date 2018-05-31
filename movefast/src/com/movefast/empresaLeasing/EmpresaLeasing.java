package com.movefast.empresaLeasing;

/**
 *
 * @author ayoub
 */
public class EmpresaLeasing {

    protected String nom;
    protected String direccio;
    protected int telefon;
    protected String contacte;

    public EmpresaLeasing(String nom, String direccio, int telefon, String contacte) {
        this.nom = nom;
        this.direccio = direccio;
        this.telefon = telefon;
        this.contacte = contacte;
    }

    //Getters i Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getContacte() {
        return contacte;
    }

    public void setContacte(String contacte) {
        this.contacte = contacte;
    }

    @Override
    public String toString() {
        return "empresaLeasing= " + nom + ", direccio= " + direccio + " telefon= " + telefon + " contacte= " + contacte;
    }

}
