/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movefast;

import com.movefast.clients.Client;
import com.movefast.empresa.Empresa;
import com.movefast.lloguer.Lloguer;
import com.movefast.vehicles.Vehicle;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ayoub
 */
public class MovefastTest {
    
    public MovefastTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of altaClient method, of class Movefast.
     */
    @Test
    public void testAltaClient() {
        System.out.println("altaClient");
        Client client = null;
        Movefast instance = new Movefast();
        instance.altaClient(client);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of baixaClient method, of class Movefast.
     */
    @Test
    public void testBaixaClient() {
        System.out.println("baixaClient");
        String dni = "";
        Movefast instance = new Movefast();
        instance.baixaClient(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cercarClient method, of class Movefast.
     */
    @Test
    public void testCercarClient() {
        System.out.println("cercarClient");
        String dni = "";
        Movefast instance = new Movefast();
        Client expResult = null;
        Client result = instance.cercarClient(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClients method, of class Movefast.
     */
    @Test
    public void testGetClients() {
        System.out.println("getClients");
        Movefast instance = new Movefast();
        HashMap<String, Client> expResult = null;
        HashMap<String, Client> result = instance.getClients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarDisponibilitat method, of class Movefast.
     */
    @Test
    public void testConsultarDisponibilitat() {
        System.out.println("consultarDisponibilitat");
        LocalDate dataInici = null;
        LocalDate dataFi = null;
        Vehicle v = null;
        Movefast instance = new Movefast();
        boolean expResult = false;
        boolean result = instance.consultarDisponibilitat(dataInici, dataFi, v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearLloguer method, of class Movefast.
     */
    @Test
    public void testCrearLloguer() {
        System.out.println("crearLloguer");
        Lloguer lloguer = null;
        Movefast instance = new Movefast();
        instance.crearLloguer(lloguer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarLloguer method, of class Movefast.
     */
    @Test
    public void testConsultarLloguer() {
        System.out.println("consultarLloguer");
        LocalDate dataInici = null;
        LocalDate dataFi = null;
        Movefast instance = new Movefast();
        Lloguer expResult = null;
        Lloguer result = instance.consultarLloguer(dataInici, dataFi);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarVehiclesDisponibles method, of class Movefast.
     */
    @Test
    public void testConsultarVehiclesDisponibles() {
        System.out.println("consultarVehiclesDisponibles");
        LocalDate dataInici = null;
        LocalDate dataFi = null;
        Movefast instance = new Movefast();
        ArrayList<Vehicle> expResult = null;
        ArrayList<Vehicle> result = instance.consultarVehiclesDisponibles(dataInici, dataFi);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of omplirLloguers method, of class Movefast.
     */
    @Test
    public void testOmplirLloguers() {
        System.out.println("omplirLloguers");
        Lloguer lloguer = null;
        Movefast instance = new Movefast();
        instance.omplirLloguers(lloguer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of omplirVehicles method, of class Movefast.
     */
    @Test
    public void testOmplirVehicles() {
        System.out.println("omplirVehicles");
        Vehicle vehicle = null;
        Movefast instance = new Movefast();
        ArrayList<Lloguer> expResult = null;
        ArrayList<Lloguer> result = instance.omplirVehicles(vehicle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarLloguers method, of class Movefast.
     */
    @Test
    public void testMostrarLloguers() {
        System.out.println("mostrarLloguers");
        Client client = null;
        Movefast instance = new Movefast();
        ArrayList<Lloguer> expResult = null;
        ArrayList<Lloguer> result = instance.mostrarLloguers(client);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaLloguerClient method, of class Movefast.
     */
    @Test
    public void testConsultaLloguerClient() {
        System.out.println("consultaLloguerClient");
        Client client = null;
        Movefast instance = new Movefast();
        ArrayList<Lloguer> expResult = null;
        ArrayList<Lloguer> result = instance.consultaLloguerClient(client);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaLloguerEmpresa method, of class Movefast.
     */
    @Test
    public void testConsultaLloguerEmpresa() {
        System.out.println("consultaLloguerEmpresa");
        Client leasing = null;
        Movefast instance = new Movefast();
        ArrayList<Lloguer> expResult = null;
        ArrayList<Lloguer> result = instance.consultaLloguerEmpresa(leasing);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPreuLloguer method, of class Movefast.
     */
    @Test
    public void testCalcularPreuLloguer() {
        System.out.println("calcularPreuLloguer");
        Lloguer ll = null;
        Movefast instance = new Movefast();
        double expResult = 0.0;
        double result = instance.calcularPreuLloguer(ll);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of altaEmpresa method, of class Movefast.
     */
    @Test
    public void testAltaEmpresa() {
        System.out.println("altaEmpresa");
        Empresa empresa = null;
        Movefast instance = new Movefast();
        instance.altaEmpresa(empresa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of baixaEmpresa method, of class Movefast.
     */
    @Test
    public void testBaixaEmpresa() {
        System.out.println("baixaEmpresa");
        String cif = "";
        Movefast instance = new Movefast();
        instance.baixaEmpresa(cif);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cercarEmpresa method, of class Movefast.
     */
    @Test
    public void testCercarEmpresa() {
        System.out.println("cercarEmpresa");
        String cif = "";
        Movefast instance = new Movefast();
        Empresa expResult = null;
        Empresa result = instance.cercarEmpresa(cif);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of altaVehicle method, of class Movefast.
     */
    @Test
    public void testAltaVehicle() {
        System.out.println("altaVehicle");
        Vehicle vehicle = null;
        Movefast instance = new Movefast();
        instance.altaVehicle(vehicle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of baixaVehicle method, of class Movefast.
     */
    @Test
    public void testBaixaVehicle() {
        System.out.println("baixaVehicle");
        String matricula = "";
        Movefast instance = new Movefast();
        instance.baixaVehicle(matricula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cercarVehicle method, of class Movefast.
     */
    @Test
    public void testCercarVehicle() {
        System.out.println("cercarVehicle");
        String matricula = "";
        Movefast instance = new Movefast();
        Vehicle expResult = null;
        Vehicle result = instance.cercarVehicle(matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVehicles method, of class Movefast.
     */
    @Test
    public void testGetVehicles() {
        System.out.println("getVehicles");
        Movefast instance = new Movefast();
        HashMap<String, Vehicle> expResult = null;
        HashMap<String, Vehicle> result = instance.getVehicles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
