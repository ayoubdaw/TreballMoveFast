package com.movefast;

import com.movefast.clients.Client;
import com.movefast.clients.Leasing;
import com.movefast.empresa.Empresa;
import com.movefast.empresaLeasing.EmpresaLeasing;
import com.movefast.vehicles.Vehicle;
import java.util.HashMap;
import com.movefast.lloguer.Lloguer;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;

public class Movefast {

    private HashMap<String, Client> clients;
    private HashMap<String, Empresa> empreses;
    private HashMap<String, Vehicle> vehicles;
    private ArrayList<Lloguer> lloguers;
    private HashMap<String, EmpresaLeasing> empresaLeasing;

    public Movefast() {
        clients = new HashMap<String, Client>();
        empreses = new HashMap<String, Empresa>();
        vehicles = new HashMap<String, Vehicle>();
        lloguers = new ArrayList<>();
        empresaLeasing = new HashMap<String, EmpresaLeasing>();

    }

    // Dona d'alta un client.
    public void altaClient(Client client) {

        clients.put(client.getDni(), client);

    }

    // Dona de baixa un client per el seu DNI.
    public void baixaClient(String dni) {
        clients.remove(dni);

    }

    // Cerca un client per el seu DNI.
    public Client cercarClient(String dni) {

        return clients.get(dni);

    }

    // Metode per fer proves a la nostra clase de proves (Per mostrar per la consola).
    public HashMap<String, Client> getClients() {
        return clients;
    }

    public boolean consultarDisponibilitat(LocalDate dataInici, LocalDate dataFi, Vehicle v) {
        boolean disponible = true;

        for (int j = 0; j < lloguers.size(); j++) {
            Lloguer x = lloguers.get(j);
            if (x.getVehicle().equals(v)) {
                if (x.getDateEntrega().isAfter(dataInici) && x.getDateLliurament().isBefore(dataFi)) {
                    disponible = false;
                    break;
                }
            }

        }
        return disponible;
    }

    public void crearLloguer(Lloguer lloguer) {
        if (consultarDisponibilitat(lloguer.getDateLliurament(), lloguer.getDateEntrega(), lloguer.getVehicle())) {
            lloguers.add(lloguer);
        } else {
            //hem de posar excepcio
        }
    }

    public Lloguer consultarLloguer(LocalDate dataInici, LocalDate dataFi) {

        for (Lloguer lloguer : lloguers) {
            if (lloguer.getDateLliurament().isAfter(dataInici) && lloguer.getDateEntrega().isBefore(dataFi)) {
                return lloguer;
            }
        }
        return null;
    }

    public ArrayList<Vehicle> consultarVehiclesDisponibles(LocalDate dataInici, LocalDate dataFi) {

// aquest mètode intenta cercar els vehicles que estan disponibles entre unes dates determinades i d'un tipus determinat
        ArrayList<Vehicle> resultat = new ArrayList<>();
        Collection<Vehicle> llistaVehicles = vehicles.values();
        for (Vehicle vehicle : llistaVehicles) {

            if (consultarDisponibilitat(dataInici, dataFi, vehicle) == true) {

                resultat.add(vehicle);
            }
        }

        return resultat;

    }

    public void omplirLloguers(Lloguer lloguer) {

        lloguers.add(lloguer);

    }

    public ArrayList<Lloguer> omplirVehicles(Vehicle vehicle) {
        // mètode per fer una Arraylist on estiguin vinculats els Vehicles amb els seus Lloguers  
        ArrayList<Lloguer> resultat = new ArrayList<Lloguer>();
        for (int i = 0; i < lloguers.size(); i++) {
            Lloguer get = lloguers.get(i);
            Vehicle x = get.getVehicle();
            if (x.equals(vehicle)) {
                resultat.add(get);
            }
        }
        return resultat;

    }

    public ArrayList<Lloguer> mostrarLloguers(Client client) {
        ArrayList<Lloguer> resultat = new ArrayList<Lloguer>();
        for (int i = 0; i < lloguers.size(); i++) {
            Lloguer get = lloguers.get(i);
            Client x = get.getClient();
            if (x.equals(client)) {
                resultat.add(get);
            }
        }
        return resultat;

    }

    //Recupera l’historial de lloguers d’un client,ordenats per la data inicial de forma decreixent.
    public ArrayList<Lloguer> consultaLloguerClient(Client client) {
        ArrayList<Lloguer> lloguersClient = new ArrayList<Lloguer>();

        for (Lloguer lloguer : lloguers) {
            if (lloguer.getClient().equals(client)) {
                lloguersClient.add(lloguer);
            }
        }
        lloguersClient.sort((a, b) -> b.getDateEntrega().compareTo(a.getDateEntrega()));
        return lloguersClient;
    }

    public ArrayList<Lloguer> consultaLloguerEmpresa(EmpresaLeasing empresaLeasing) {
        ArrayList<Lloguer> lloguersEmpresa = new ArrayList<Lloguer>();

        for (Lloguer lloguer : lloguers) {
            if (lloguer.getClient() instanceof Leasing
                    && ((Leasing) lloguer.getClient()).getEmpresaLeasing().equals(empresaLeasing)) {
                lloguersEmpresa.add(lloguer);
            }
        }
        lloguersEmpresa.sort((a, b) -> b.getDateEntrega().compareTo(a.getDateEntrega()));
        return lloguersEmpresa;
    }

    public void crearEmpresaLeasing(EmpresaLeasing empLeasing) {
        empresaLeasing.put(empLeasing.getNom(), empLeasing);
    }

    public double calcularPreuLloguer(Lloguer ll) {
        long dies;
        double preu;
        dies = ChronoUnit.DAYS.between(ll.getDateLliurament(), ll.getDateEntrega()) + 1;

        Vehicle v = ll.getVehicle();
        if (ll.getClient() instanceof Leasing) {
            preu = dies * v.getPreuDia();
        } else {

            preu = dies * (v.getPreuDia() * 0.9);
        }
        return preu;
    }

    // Dona d'alta una empresa.
    public void altaEmpresa(Empresa empresa) {

        empreses.put(empresa.getCif(), empresa);

    }

    // Dona de baixa una empresa per un cif.
    public void baixaEmpresa(String cif) {
        empreses.remove(cif);

    }

    // Cerca una empresa per el seu cif.
    public Empresa cercarEmpresa(String cif) {
        return empreses.get(cif);
    }

    // Dona d'alta un vehicle.
    public void altaVehicle(Vehicle vehicle) {
        vehicles.put(vehicle.getMatricula(), vehicle);

    }

    // Dona de baixa un vehicle per la seva matricula.
    public void baixaVehicle(String matricula) {
        vehicles.remove(matricula);
    }

    // Cerca un vehicle per la seva matricula.
    public Vehicle cercarVehicle(String matricula) {
        return vehicles.get(matricula);

    }

    // Metode per fer proves a la nostra clase de proves (Per mostrar per la consola).
    public HashMap<String, Vehicle> getVehicles() {
        return vehicles;

    }

}
