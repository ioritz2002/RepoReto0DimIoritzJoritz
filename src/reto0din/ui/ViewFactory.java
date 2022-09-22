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
    public View getView(String param) throws NullPointerException{
        if (param.equalsIgnoreCase("Graphic")) {
            return new SwingViewImplementation();
        }
        else if (param.equalsIgnoreCase("Text")) {
            return new textViewImplementation();
        } 
        else{
            throw new NullPointerException();
        }
         
    }
}
