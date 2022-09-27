/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GAME
 */
public class ModelFactoryTest {
    
   public ModelFactoryTest() {
        ModelFactory myFactory = new ModelFactory();
        assertNotNull("The factory instance can not be null", myFactory);
    }

    /**
     * Test of getModel method, of class ModelFactory.
     */
    @Test
    public void testGetModelDatabase() {
        String param = "database";
        boolean isInstance = false;
        ModelFactory myFactory = new ModelFactory();
        Model myModel = myFactory.getModel(param);

        assertNotNull("The model can not be null", myModel);
        if (myModel instanceof Model) {
            isInstance = true;
        }

        assertTrue("The model has to be an implementation of Model interface", isInstance);
    }

    @Test
    public void testGetModelFile() {
        String param = "file";
        boolean isInstance = false;
        ModelFactory myFactory = new ModelFactory();
        Model myModel = myFactory.getModel(param);

        assertNotNull("The model can not be null", myModel);
        if (myModel instanceof Model) {
            isInstance = true;
        }

        assertTrue("The model has to be an implementation of Model interface", isInstance);
    }
    
}
