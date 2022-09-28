/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.model;

import java.io.File;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * 
 * @author 2dam
 */
public class FileModelImplementation implements Model{    
    
    /**
     * Metodo que recoge el mensaje
     * @return 
     */
    @Override
    public String getGreeting() {
        String greeting = ResourceBundle.getBundle("reto0din.model.greeting").getString("greeting");
        return greeting;
    }
    
}
