/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kasia
 */
public class Container {
    
    int number;

    public Container() {
        number = 0;
    }
    
    public int contains() {
        return number;
    }
    public void add(int amount) {
        if (amount > 0){
            number = Integer.min(number + amount, 100);
        }
    }
    public void remove(int amount) {
        if (amount > 0){
            number = Integer.max(number - amount, 0);
        }
    }
    @Override
    public String toString() {
        return String.valueOf(number + "/100");
    }
}
