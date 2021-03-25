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
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        //adds the parameter item to the storage unit that is also given as a parameter.
        storage.putIfAbsent(unit, new ArrayList<>());
        storage.get(unit).add(item);
    }
    public ArrayList<String> contents(String storageUnit) {
        //returns a list that contains all the items in the storage unit 
        //indicated by the parameter. If there is no such storage unit or it contains no items, 
        //the method should return an empty list.
        return storage.getOrDefault(storageUnit, new ArrayList<>());
    }
    public void remove(String storageUnit, String item) {
        //removes the given item from the given storage unit. NB! 
        //Only removes one item — if there are several items with the same name, 
        //the rest still remain. If the storage unit would be empty after the removal, 
        //the method also removes the unit.
        ArrayList list = storage.get(storageUnit);
        list.remove(list.indexOf(item));
        if (storage.get(storageUnit).isEmpty()) {
            storage.remove(storageUnit);
        }
    }
    public ArrayList<String> storageUnits() {
        //returns the names of the storage units as a list. 
        //NB! Only the units that contain items are listed.
        ArrayList<String> list = new ArrayList<>();
        for (String unit : storage.keySet()) {
            if (!storage.get(unit).isEmpty()) {
                list.add(unit);
            }
        }
        return list;
    }
    
}
