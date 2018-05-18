package com.movefast;

import com.movefast.clients.Client;
import com.movefast.empresa.Empresa;
import com.movefast.vehicles.Vehicle;
import java.util.HashMap;
import com.movefast.lloguer.Lloguer;
import java.util.ArrayList;

public class Movefast {

    private HashMap<String, Client> clients;
    private HashMap<String, Empresa> empreses;
    private HashMap<String, Vehicle> vehicles;
    private ArrayList<Lloguer> lloguers;
    private HashMap<String, ArrayList> llistaLloguers;

    public Movefast() {
        clients = new HashMap<String, Client>();
        empreses = new HashMap<String, Empresa>();
        vehicles = new HashMap<String, Vehicle>();
        lloguers = new ArrayList<>();
        llistaLloguers = new HashMap<String, ArrayList>();
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

    public void omplirLloguers(Lloguer lloguer) {
      
            lloguers.add(lloguer);
        

    }
     public void mostrarLloguers() {
           
         for (int i =0; i< lloguers.size();i++){
             lloguers.get(i);
         }
         
      /*   Lloguer llog1 = lloguers.get(0);
         
         return llog1;*/

    }

    public void altaLloguer(Lloguer lloguer) {
        llistaLloguers.put(lloguer.getClient().getDni(), lloguers);
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
