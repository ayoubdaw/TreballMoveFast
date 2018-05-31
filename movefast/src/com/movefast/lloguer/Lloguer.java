package com.movefast.lloguer;

import com.movefast.clients.Client;
import com.movefast.excepcions.LloguerException;
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

    public Lloguer(int numFactura, LocalDate dateLliurament, LocalDate dateEntrega, Vehicle vehicle, Client client) throws LloguerException{
        this.numFactura = numFactura;
        this.dateLliurament = dateLliurament;
        this.dateEntrega = dateEntrega;
        this.vehicle = vehicle;
        this.client = client;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) throws LloguerException {
        if (numFactura == 0) {
            throw new LloguerException ("El numero de factura no pot esser 0 o null");
        }
        this.numFactura = numFactura;
    }

    public LocalDate getDateLliurament() {
        return dateLliurament;
    }

    public void setDateLliurament(LocalDate dateLliurament) throws LloguerException {
        if (dateLliurament.isBefore(LocalDate.now()) || dateLliurament.isEqual(LocalDate.now())) {
        throw new LloguerException ("Data de lliurament no pot esser anterior a avui, ni avui");
    }        
        this.dateLliurament = dateLliurament;
    }

    public LocalDate getDateEntrega() {
        return dateEntrega;
    }

    public void setDateEntrega(LocalDate dateEntrega) throws LloguerException {
        if (dateEntrega.isBefore(dateLliurament)) {
            throw new LloguerException ("Data entrega no pot esser anterior a la data lliurament");
        }
        this.dateEntrega = dateEntrega;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) throws LloguerException {
        if (vehicle == null) {
            throw new LloguerException("El vehicle no potser null");
        }
        this.vehicle = vehicle;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) throws LloguerException{
        if (vehicle == null) {
            throw new LloguerException("El client no pot esser null");
        }
        this.client = client;
    }

    @Override
    public String toString() {
        return "Lloguer{" + "numFactura=" + numFactura + ", dateLliurament=" + dateLliurament + ", dateEntrega=" + dateEntrega + ", vehicle=" + vehicle + ", client=" + client + '}';
    }

}
