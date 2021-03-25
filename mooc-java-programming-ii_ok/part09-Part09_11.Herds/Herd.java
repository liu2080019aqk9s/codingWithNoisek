/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kasia
 */
import java.util.ArrayList;
public class Herd implements Movable{
    private ArrayList<Movable> list;

    public Herd() {
        list = new ArrayList<>();
    }
    public String toString() {
        //Returns a string representation of the positions of the members of the herd, 
        //each on its own line.
        String text = "";
        for (Movable movable : list) {
            text += movable.toString() + "\n";
        }
        return text;
    }
    public void addToHerd(Movable movable) {
        //Adds an object that implements the Movable interface to the herd.
        list.add(movable);
    }
    public void move(int dx, int dy) {
        //Moves the herd with by the amount specified by the parameters. 
        //Notice that here you have to move each member of the herd.
        for (Movable movable : list) {
            movable.move(dx, dy);
        }
    }
}
