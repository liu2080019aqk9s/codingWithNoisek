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
public class Flight {
    private Airplane airplane;
    private Airport departure;
    private Airport destination;
    public Flight(Airplane airplane, Airport departure, Airport destination) {
        this.airplane = airplane;
        this.departure = departure;
        this.destination = destination;
    }
    public Airplane getAirplane() {
        return airplane;
    }
    public Airport getDeparture() {
        return departure;
    }
    public Airport getDestination() {
        return destination;
    }
    @Override
    public String toString() {
        return this.airplane + " (" + this.departure + "-" + this.destination + ")";
    }
}
