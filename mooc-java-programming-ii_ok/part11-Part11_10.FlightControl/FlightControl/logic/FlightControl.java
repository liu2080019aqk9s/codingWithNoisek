/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Airport;
import FlightControl.domain.Flight;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Kasia
 */
public class FlightControl {
    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;

    public FlightControl() {
        this.flights = new HashMap<>();
        this.airplanes = new HashMap<>();
    }

    public void addAirplane(String name, int capacity) {
        Airplane plane = new Airplane(name, capacity);
        this.airplanes.put(name, plane);
    }

    public void addFlight(Airplane plane, String departure, String destination) {
        Flight flight = new Flight(plane, new Airport(departure), new Airport(destination));
        this.flights.put(flight.toString(), flight);
    }

    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Airplane getAirplane(String name) {
        return this.airplanes.get(name);
    }
}
