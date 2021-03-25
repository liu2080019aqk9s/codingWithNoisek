/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kasia
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> vehicleRegistry;

    public VehicleRegistry() {
        this.vehicleRegistry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        //assigns the owner it received as a parameter to a car that corresponds to the license plate 
        //received as a parameter. If the license plate doesn't have an owner, the method returns true. 
        //If the license already has an owner attached, the method returns false and does nothing.
        if (vehicleRegistry.get(licensePlate) == null) {
            vehicleRegistry.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    public String get(LicensePlate licensePlate) {
        //returns the owner of the car corresponding to the license plate received 
        //as a parameter. If the car isn't in the registry, the method returns null.
        return vehicleRegistry.get(licensePlate);
    }
    public boolean remove(LicensePlate licensePlate) {
        //removes the license plate and attached data from the registry. 
        //The method returns true if removed successfully and false if the license plate wasn't in the registry.
        if (vehicleRegistry.containsKey(licensePlate)) {
            vehicleRegistry.remove(licensePlate);
            return true;
        }
        return false;
    }
    public void printLicensePlates(){
        //prints the license plates in the registry.
        for (LicensePlate licensePlate : vehicleRegistry.keySet()) {
            System.out.println(licensePlate.toString());
        }
    }
    public void printOwners() {
        //prints the owners of the cars in the registry. Each name should only be printed once, 
        //even if a particular person owns more than one car.
        ArrayList<String> owners = new ArrayList<>();
        for (String owner : vehicleRegistry.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            }
        }
    }
    
}
