package com.movefast;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import com.movefast.clients.Client;

public class ComMovefast {

    Client Ayoub = new Client("46391111L", "Ayoub", "Bouyssfdaouan", 601226553, "458788741p");
    HashMap<String, Client> clients = new HashMap<String, Client>();
    
    public void altaClient(String dni, Client client) {
        clients.put(client.getDni(), client);
    }
}
