/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Kasia
 */
public class TemperatureSensor implements Sensor{
    private boolean status;
    public TemperatureSensor() {
        status = false;
    }
    @Override
    public boolean isOn() {
        return status;
    }
    @Override
    public void setOn() {
        status = true;
    }
    @Override
    public void setOff() {
        status = false;
    }
    @Override
    public int read(){
        if (status) {
            return new Random().nextInt(61) - 30;
        }
        throw new IllegalStateException();
    }
    
}
