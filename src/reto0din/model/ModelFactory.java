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

    /**
     * Metodo que obtiene el modelo para conseguir el mensaje
     * @param param utilizado para escoger el modo en el que se obtendra el mensaje
     * @return Retorna una implementacion del modelo, en el caso de que la opcion elegida no sea correcta se devolvera null
     */
    public Model getModel(String param){
        if (param.equalsIgnoreCase("file")) {
            return new FileModelImplementation();
        }else if(param.equalsIgnoreCase("database")){
            return new DbModelImplementation();
        }
        return null;
    }
}
