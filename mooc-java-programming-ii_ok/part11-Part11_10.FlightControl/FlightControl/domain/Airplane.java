/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author Kasia
 */
public class Airplane {
    private String name;
    private int capacity;
    public Airplane(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    public String getName() {
        return name;
    }
    public int getCapacity() {
        return capacity;
    }
    @Override
    public String toString() {
        return this.name + " (" + this.capacity + " capacity)";
    }
}
