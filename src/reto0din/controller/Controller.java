/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.controller;

import reto0din.model.Model;
import reto0din.ui.View;

/**
 *
 * @author iorit
 */
public class Controller {

    private View myView;
    private Model myModel;

    public Controller(View myView, Model myModel) {
        this.myView = myView;
        this.myModel = myModel;
    }

    /**
     * Metodo que recoge la vista y el modelo para mostrar el mensaje
     */
    public void run() {
        myView.showGreeting(myModel.getGreeting());
    }
}
