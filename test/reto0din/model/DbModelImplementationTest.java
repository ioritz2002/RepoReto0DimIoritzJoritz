/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.model;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author iorit
 */
public class DbModelImplementationTest {
    
    public DbModelImplementationTest() {
        Model myModel = new DbModelImplementation();
        assertNotNull("The model is null", myModel);
    }
    
    @BeforeClass
    public static void setUpClass() {
       DbModelImplementation myModel = new DbModelImplementation();
        myModel.openConnection();
    }
    
    @AfterClass
    public static void tearDownClass() {
        
        DbModelImplementation myModel = new DbModelImplementation();
        try {
            myModel.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    

    /**
     * Test of openConnection method, of class DbModelImplementation.
     */
    @Test
    public void testOpenConnection() {
        boolean exceptionLaunched = false;
        try {
           DbModelImplementation myModel = new DbModelImplementation();
           myModel.openConnection(); 
        } catch (Exception e) {
            exceptionLaunched = true;
            assertFalse("A exception has been launched wile opening the conection", exceptionLaunched);
        }
        
    }

    /**
     * Test of closeConnection method, of class DbModelImplementation.
     */
    @Test
    public void testCloseConnection() throws Exception {
        DbModelImplementation myModel = new DbModelImplementation();
        try {
            myModel.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Test of getGreeting method, of class DbModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        DbModelImplementation myModel = new DbModelImplementation();
        String greeting = myModel.getGreeting();
        
        assertNotNull("The greeting can't be null", greeting);
        assertEquals("The obtained message is not correct", greeting, "Hola Mundo");
    }
    
}
