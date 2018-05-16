package com.movefast;

import com.movefast.clients.Client;
import java.util.HashMap;


public class Movefast {
   private HashMap<String, Client> clients;
   
    public Movefast() {
        clients = new HashMap<String, Client>();
    }

 

    public void altaClient( Client client) {
        
        clients.put(client.getDni(), client);
        
    }
    
    public HashMap<String, Client> getClients() {
        return clients;
    }

}
