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
        Client ayoub = new Client("46391111L", "Ayoub", "Bouyssfdaouan", 601226553, "458788741p");
        Client emilio = new Client("463911231L", "Emilio", "Gallardo", 601226553, "4587f21741p");
        
        Vehicle vehicle1 = new Vehicle("7458-QWE", 105.5, "B", true);
        Vehicle vehicle2 = new Vehicle("1558-TKR", 105.5, "B", false);
       
        
        LocalDate date1 = LocalDate.of(2018, 5, 15);
        LocalDate date2 = LocalDate.of(2018, 6, 15);
        LocalDate dataLliurament = LocalDate.of(2018, 5, 17);
        LocalDate dataEntrega = LocalDate.of(2018, 6, 10);
        
       
        Lloguer llog1 = new Lloguer(1, dataLliurament, dataEntrega,vehicle1,ayoub);
        Lloguer llog2 = new Lloguer(2, date1, date2,vehicle2,ayoub);
        Lloguer llog3 = new Lloguer(3,date1,dataLliurament,vehicle2,ayoub);
        
         Vehicle vehicle3 = new Vehicle("6723-YHU",78.7,"B",true,llog1);
        c.altaClient(ayoub);
        c.altaClient(emilio);
        HashMap<String, Client> clients = c.getClients();
        HashMap<String, Vehicle> vehicles = c.getVehicles();
        // c.baixaClient("46391111L");
        // System.out.println(clients);
        // System.out.println(c.cercarClient("463911231L"));
        c.altaVehicle(vehicle1);
        c.altaVehicle(vehicle2);
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
      
      
    /*  c.omplirVehicles(vehicle1);
      c.omplirVehicles(vehicle2);
      c.omplirVehicles(vehicle3); */
      
     // System.out.println(c.cercarClient("46391111L")); 
      
      
      /* l'ho de abaix un intent 
      ArrayList<Vehicle> mostrarVehiclesDiponibles = c.consultarVehiclesDisponibles(dataEntrega, date2);
       
      
      for(Vehicle disponible: mostrarVehiclesDisponibles){
          
          System.out.println(disponible.toString());
      } */
      
     // System.out.println(c.consultarVehiclesDisponibles(dataEntrega, date2));
       // System.out.println(c.mostrarLloguers(ayoub));
       // System.out.println(c.omplirVehicles(vehicle2));
     
        System.out.println(c.calcularPreuLloguer(llog3));
          
      }
      
      
    }
       
        
    
    

