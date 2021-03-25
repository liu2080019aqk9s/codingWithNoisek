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
public class BoxWithMaxWeight extends Box {
    private final int capacity;
    private ArrayList<Item> items;
    private int usedCapacity;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
        this.usedCapacity = 0;
    }
    
    public void add(Item item) {
        if (item.getWeight() + usedCapacity <= capacity) {
            items.add(item);
            usedCapacity += item.getWeight();
        }
    }
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
