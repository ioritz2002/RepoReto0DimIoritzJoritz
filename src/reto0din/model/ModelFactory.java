/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.model;

/**
 *
 * @author 2dam
 */
public class ModelFactory {

    public Model getModel(String param){
        if (param.equalsIgnoreCase("file")) {
            return new FileModelImplementation();
        }else if(param.equalsIgnoreCase("database")){
            return new DbModelImplementation();
        }
        return null;
    }
}
