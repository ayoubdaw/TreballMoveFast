package com.movefast.clients;

public class Client {

    private String dni;
    private String nom;
    private String llinatge;
    private int telefon;
    private String numComptebancari;

    // CONSTRUCTOR DE CLIENT
    public Client(String dni, String nom, String llinatge, int telefon, String numComptebancari) {
        this.dni = dni;
        this.nom = nom;
        this.llinatge = llinatge;
        this.telefon = telefon;
        this.numComptebancari = numComptebancari;
    }

    // GETTERS I SETTERS DE CLIENT
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLlinatge() {
        return llinatge;
    }

    public void setLlinatge(String llinatge) {
        this.llinatge = llinatge;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getNumComptebancari() {
        return numComptebancari;
    }

    public void setNumComptebancari(String numComptebancari) {
        this.numComptebancari = numComptebancari;
    }

    @Override
    public String toString() {
        return "Client{" + "dni=" + dni + ", nom=" + nom + ", llinatge=" + llinatge + ", telefon=" + telefon + ", numComptebancari=" + numComptebancari + '}';
    }

}
