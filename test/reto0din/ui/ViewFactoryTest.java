/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.ui;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GAME
 */
public class ViewFactoryTest {

    public ViewFactoryTest() {
        ViewFactory myFactory = new ViewFactory();
        assertNotNull("The factory instance can not be null", myFactory);
    }
    
    @Test
    public void testGetViewGraphic() {

        String param = "graphic";
        ViewFactory instance = new ViewFactory();
        View result = instance.getView(param);
        boolean isInstance = false;

        assertNotNull("The view can not be null", result);
        if (result instanceof View) {
            isInstance = true;
        }

        assertTrue("The view has to be an implementation of View interface", isInstance);

    }

    @Test
    public void testGetViewText() {
        String param = "text";
        ViewFactory instance = new ViewFactory();
        View result = instance.getView(param);
        boolean isInstance = false;

        assertNotNull("The view can not be null", result);
        if (result instanceof View) {
            isInstance = true;
        }

        assertTrue("The view has to be an implementation of View interface", isInstance);

    }

}
