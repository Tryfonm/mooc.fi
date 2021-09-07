/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import application.Sensor;
import java.util.Random;

/**
 *
 * @author micha
 */
public class TemperatureSensor implements Sensor {

    private boolean isOn;

    public TemperatureSensor() {
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public int read() {
        if (this.isOn == false) {
            throw new IllegalArgumentException("The temperature sensor is off - can't read");
        }
        int randomNumber = new Random().nextInt(61) - 30;
        return randomNumber;
    }

}
