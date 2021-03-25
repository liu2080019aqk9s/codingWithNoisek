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
public class OneItemBox extends Box {
    private ArrayList<Item> items;

    public OneItemBox() {
        this.items = new ArrayList<>();
    }
    
    public void add(Item item) {
        if (items.size()==0) {
            items.add(item);
        }
    }
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
