package com.movefast;

import com.movefast.clients.Client;
import com.movefast.empresa.Empresa;
import com.movefast.vehicles.Vehicle;
import java.util.HashMap;
import com.movefast.lloguer.Lloguer;
import java.time.LocalDate;
import java.util.ArrayList;

public class Movefast {

    private HashMap<String, Client> clients;
    private HashMap<String, Empresa> empreses;
    private HashMap<String, Vehicle> vehicles;
    private ArrayList<Lloguer> lloguers;
    private HashMap<String, ArrayList> llistaLloguers;
    // el seguent arraylist seria per emmegatzemar els vehicles amb els seus lloguers per poder saber si estan disponibles
    private ArrayList<Vehicle> vehicless;

    public Movefast() {
        clients = new HashMap<String, Client>();
        empreses = new HashMap<String, Empresa>();
        vehicles = new HashMap<String, Vehicle>();
        lloguers = new ArrayList<>();
        vehicless = new ArrayList<>();
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

    public boolean consultarDisponibilitat(LocalDate dataInici, LocalDate dataFi, Vehicle v) {//no funciona
        boolean disponible = true;

        for (Lloguer lloguer : lloguers) {

            if (lloguer.getVehicle().equals(v)) {

            }

            if (!(dataInici.isAfter(lloguer.getDateEntrega()) || dataFi.isBefore(lloguer.getDateLliurament()))) {
                disponible = false;
                return disponible;
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
            if (lloguer.getDateLliurament().equals(dataInici) && lloguer.getDateEntrega().equals(dataFi)) {
                return lloguer;
            }
        }
        return null;
    }

    public ArrayList<Vehicle> consultarVehiclesTipus(String tipusCarnet, LocalDate dataInici, LocalDate dataFi) {
       
// aquest mètode intenta cercar els vehicles que estan disponibles entre unes dates determinades i d'un tipus determinat
          
          ArrayList<Vehicle> resultat = new ArrayList<Vehicle>();
        for (int i = 0; i < vehicless.size(); i++) {
            Lloguer get = lloguers.get(i);
            Vehicle x = get.getVehicle();
          if (x.getTipusCarnet().equals(tipusCarnet) && x.getLloguer().getDateEntrega().isBefore(dataInici) && x.getLloguer().getDateLliurament().isBefore(dataFi)) {
                resultat.add(get);
            }
        }
    
       return resultat;

      
    }
        
        
        

    

    public void omplirLloguers(Lloguer lloguer) {

        /*  lloguers.add(0, lloguer);*/
 /*   for (int i = 0; i < lloguers.size(); i++) { */
        lloguers.add(lloguer);
        /*  } */

    }
    
    
    public void omplirVehicless (Vehicle vehicleLloguer){
     // mètode per fer una Arraylist on estiguin vinculats els Vehicles amb els seus Lloguers   
        vehicless.add(vehicleLloguer);
        
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
