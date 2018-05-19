package com.movefast.proves;

import com.movefast.Movefast;
import com.movefast.clients.Client;
import com.movefast.vehicles.Vehicle;
import com.movefast.lloguer.Lloguer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Prova {
    
    public static void main(String[] args) {
        Movefast c = new Movefast();
        Client Ayoub = new Client("46391111L", "Ayoub", "Bouyssfdaouan", 601226553, "458788741p");
        Client Emilio = new Client("463911231L", "Emilio", "Gallardo", 601226553, "4587f21741p");
        
        Vehicle Vehicle1 = new Vehicle("7458-QWE", 105.5, "B", true);
        Vehicle Vehicle2 = new Vehicle("1558-TKR", 105.5, "B", false);
       
        
        LocalDate date1 = LocalDate.of(2018, 5, 15);
        LocalDate date2 = LocalDate.of(2018, 6, 15);
        LocalDate dataLliurament = LocalDate.of(2018, 5, 17);
        LocalDate dataEntrega = LocalDate.of(2018, 6, 10);
        
       
        Lloguer llog1 = new Lloguer(1, dataLliurament, dataEntrega,Vehicle1,Ayoub);
        Lloguer llog2 = new Lloguer(2, date1, date2,Vehicle2,Ayoub);
        Lloguer llog3 = new Lloguer(3,date1,dataLliurament,Vehicle2,Ayoub);
        
         Vehicle vehicle3 = new Vehicle("6723-YHU",78.7,"B",true,llog1);
        c.altaClient(Ayoub);
        c.altaClient(Emilio);
        HashMap<String, Client> clients = c.getClients();
        HashMap<String, Vehicle> vehicles = c.getVehicles();
        c.baixaClient("46391111L");
        // System.out.println(clients);
        // System.out.println(c.cercarClient("463911231L"));
        c.altaVehicle(Vehicle1);
        c.altaVehicle(Vehicle2);
        //System.out.println(vehicles);
        // c.baixaVehicle("7458-QWE");
        // System.out.println(vehicles);
       // System.out.println(c.cercarVehicle("1558-TKR"));
        // System.out.println(vehicles);

       c.omplirLloguers(llog1);
       c.omplirLloguers(llog2);
   
       c.omplirLloguers(llog3);
       //c.crearLloguer(llog1);
      // c.crearLloguer(llog2);
      // System.out.println(c.mostrarLloguers(Ayoub));
      /* ArrayList<Lloguer> mostrarLloguers = c.mostrarLloguers(Ayoub);
        for (Lloguer actual : mostrarLloguers) {
            System.out.println(actual.toString()); */
      c.omplirVehicless(Vehicle1);
      c.omplirVehicless(Vehicle2);
      c.omplirVehicless(vehicle3);
      
      /* l'ho de abaix un intent */
      /*  ArrayList<Vehicle> mostrarVehiclesDiponibles = c.consultarVehiclesTipus("B", date1, date2);
      for(Vehicle diponible:mostrarVehiclesDisponibles){ */
          
      }
      
      
        }
       
        
    
    

