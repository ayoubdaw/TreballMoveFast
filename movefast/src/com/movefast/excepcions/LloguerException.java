/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movefast.excepcions;

/**
 *
 * @author Esteve SC
 */
public class LloguerException extends Exception {
    
    public LloguerException() {
        
    }
    
    public LloguerException(String missatge) {
        super (missatge);
    }
    
}
