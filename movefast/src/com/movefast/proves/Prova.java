/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movefast.proves;
import com.movefast.Movefast;
import com.movefast.clients.Client;
import java.util.HashMap;

public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Movefast c = new Movefast();
        Client Ayoub = new Client("46391111L", "Ayoub", "Bouyssfdaouan", 601226553, "458788741p");
        Client Emilio = new Client("463911231L", "Emilio", "Gallardo", 601226553, "4587f21741p");
        
        c.altaClient( Ayoub);
        c.altaClient(Emilio);
        HashMap<String, Client> clients = c.getClients();
        
        System.out.println(clients);
        
    }
    
}
