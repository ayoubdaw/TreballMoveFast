package com.movefast;

import com.movefast.clients.Client;
import com.movefast.empresa.Empresa;
import com.movefast.vehicles.Vehicle;
import java.util.HashMap;

public class Movefast {
    
    private HashMap<String, Client> clients;
    private HashMap<String, Empresa> empreses;
    private HashMap<String, Vehicle> vehicles;
    
    public Movefast() {
        clients = new HashMap<String, Client>();
        empreses = new HashMap<String, Empresa>();
        vehicles = new HashMap<String, Vehicle>();
    }
    
    public void altaClient(Client client) {
        
        clients.put(client.getDni(), client);
        
    }
    
    public void baixaClient(String dni) {
        clients.remove(dni);
        
    }
    
    public Client cercarClient(String dni) {
        return clients.get(dni);
        
    }
    
    public HashMap<String, Client> getClients() {
        return clients;
    }
    
    public void altaEmpresa(Empresa empresa) {
        
        empreses.put(empresa.getCif(), empresa);
        
    }
    
    public void baixaEmpresa(String cif) {
        empreses.remove(cif);
        
    }
    
    public Empresa cercarEmpresa(String cif) {
        return empreses.get(cif);
    }
    
    public void altaVehicle(Vehicle vehicle) {
        vehicles.put(vehicle.getMatricula(), vehicle);
        
    }
    
    public void baixaVehicle(String matricula) {
        vehicles.remove(matricula);
    }
    
    public Vehicle cercarVehicle(String matricula) {
        return vehicles.get(matricula);
        
    }
    
    public HashMap<String, Vehicle> getVehicles() {
        return vehicles;
        
    }
    
    
}
