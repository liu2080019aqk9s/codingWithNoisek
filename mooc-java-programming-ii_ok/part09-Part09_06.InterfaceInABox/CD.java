/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kasia
 */
public class CD implements Packable {
    private String artist;
    private String name;
    private int year;
    static private final double weight = 0.1;

    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
    }
    
    @Override
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return artist + ": " + name + " (" + year + ")";
    }
}
