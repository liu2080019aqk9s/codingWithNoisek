/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Kasia
 */
public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    @Override
    public boolean isOn() {
        boolean isOn = sensors.stream()
                .map (sensor -> sensor.isOn())
                .reduce (true, (acc, value) -> acc && value);
        return isOn;
    }
    @Override
    public void setOn() {
        sensors.forEach(sensor -> sensor.setOn());
    }
    @Override
    public void setOff() {
        if(sensors.size() > 0) {
            sensors.get(0).setOff();
        }
    }
    @Override
    public int read(){
        if (this.isOn()) {
            Double average = sensors.stream()
                    .mapToInt (sensor -> sensor.read())
                    .average()
                    .getAsDouble();
            int intAverage = average.intValue();
            readings.add(intAverage);
            return intAverage;
        }
        throw new IllegalStateException();
    }
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }
    public List<Integer> readings() {
//        if (this.isOn()) {
//            ArrayList<Integer> readings = sensors.stream()
//                    .map(sensor -> sensor.read())
//                    .collect(Collectors.toCollection(ArrayList::new));
//            return readings;
//        }
//        throw new IllegalStateException();
        return readings;
    }
}
