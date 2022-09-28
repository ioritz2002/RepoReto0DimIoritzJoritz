/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din;

import java.util.ResourceBundle;
import reto0din.controller.Controller;
import reto0din.model.Model;
import reto0din.model.ModelFactory;
import reto0din.ui.View;
import reto0din.ui.ViewFactory;

/**
 * Clase Principal
 * @author iorit
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        View myView = null;
        Model myModel = null;
        ViewFactory myViewFactory = new ViewFactory();
        ModelFactory myModelFactory = new ModelFactory();
        String viewOption = ResourceBundle.getBundle("reto0din.configFile").getString("view");
        String modelOption = ResourceBundle.getBundle("reto0din.configFile").getString("model");
        
        //Obtenemos la opcion de la vista y de la clase
        myView = myViewFactory.getView(viewOption);
        myModel = myModelFactory.getModel(modelOption);
        
        Controller controller = new Controller(myView, myModel);
        //Llamamos al metodo run y lo ejecutamos
        controller.run();
    }
    
}
