/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.ui;

/**
 *
 * @author iorit
 */
public class ViewFactory {
    
    /**
     * Metodo en el que muestra la forma en la que aparecera el mensaje
     * @param param utilizado para escoger el modo en el que se mostrara e mensaje
     * @return 
     */
    public View getView(String param){
        if (param.equalsIgnoreCase("Graphic")) {
            return new SwingViewImplementation();
        }
        else if (param.equalsIgnoreCase("Text")) {
            return new TextViewImplementation();
        } 
        
         return null;
    }
}
