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
public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable packable) {
        if (weight() + packable.weight() <= capacity) {
            items.add(packable);
        }
    }
    
    public double weight() {
        double weight = 0;
        for (Packable item : items) {
            weight += item.weight();
        }
        return weight;
    }
    
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
