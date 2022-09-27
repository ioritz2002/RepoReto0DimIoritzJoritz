/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.model;

import java.util.ResourceBundle;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author iorit
 */
public class FileModelImplementationTest {
    
    
    
    public FileModelImplementationTest() {
        Model myModel = new FileModelImplementation();
        assertNotNull("File model implementation is null", myModel);
    }

    /**
     * Test of getGreeting method, of class FileModelImplementation.
     */
    
    @Test
    public void testGetGreeting() {
        String correctGreeting = ResourceBundle.getBundle("reto0din.model.greeting").getString("greeting");
        Model myModel = new FileModelImplementation();
        String greeting = myModel.getGreeting();
        
        assertNotNull("The can't be null", greeting);
        assertEquals("The obtained message is correct",correctGreeting, greeting);
    }
    
}
