package com.movefast.lloguer;

import com.movefast.clients.Client;
import com.movefast.vehicles.Vehicle;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Lloguer {

    private int numFactura;
    private LocalDate dateLliurament;
    private LocalDate dateEntrega;
    private Vehicle vehicle;
    private Client client;

    public Lloguer(int numFactura, LocalDate dateLliurament, LocalDate dateEntrega, Vehicle vehicle, Client client) {
        this.numFactura = numFactura;
        this.dateLliurament = dateLliurament;
        this.dateEntrega = dateEntrega;
        this.vehicle = vehicle;
        this.client = client;
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

    public void setDateEntrega(LocalDate dateEntrega) {
        this.dateEntrega = dateEntrega;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Lloguer{" + "numFactura=" + numFactura + ", dateLliurament=" + dateLliurament + ", dateEntrega=" + dateEntrega + ", vehicle=" + vehicle + ", client=" + client + '}';
    }

}
