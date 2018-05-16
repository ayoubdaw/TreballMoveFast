package com.movefast;

import com.movefast.clients.Client;
import com.movefast.empresa.Empresa;
import java.util.HashMap;


public class Movefast {
   private HashMap<String, Client> clients;
   private HashMap<String, Empresa> empreses;
   
    public Movefast() {
        clients = new HashMap<String, Client>();
        empreses = new HashMap<String, Empresa>();
    }

 

    public void altaClient( Client client) {
        
        clients.put(client.getDni(), client);
        
    }
    
    public void baixaClient(String dni){
        clients.remove(dni);
        
    }
    
    public Client cercarClient(String dni){
        return clients.get(dni);
        
    }
    public HashMap<String, Client> getClients() {
        return clients;
    }
    
     public void altaEmpresa(Empresa empresa) {

        empreses.put(empresa.getCif(), empresa);

    }

}
