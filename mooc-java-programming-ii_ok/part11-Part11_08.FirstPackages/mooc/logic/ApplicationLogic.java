/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

import mooc.ui.UserInterface;

/**
 *
 * @author Kasia
 */
public class ApplicationLogic {
    private UserInterface ui;
    public ApplicationLogic(UserInterface ui) {
        //The constructor of the ApplicationLogic class. It receives as a parameter a 
        //class that implements the UserInterface interface. NB: For application logic
        //to see the interface, it must be "imported". Add the line import mooc.ui.UserInterface 
        //at the beginning of the file.
        this.ui = ui;
    }
    public void execute(int times) {
        //Prints the string "Application logic is working" the number of times that 
        //is indicated by the variable times. After each print, the method should call the 
        //update() method of the object that was received as a constructor parameter 
        //(which implements the UserInterface interface).
        for (int i = 0; i < times; i++) {
            System.out.println("Application logic is working");
            ui.update();
        }
    }
}
