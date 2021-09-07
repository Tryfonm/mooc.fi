/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author micha
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        boolean atLeastOneIsOff = false;
        for (Sensor sensor : this.sensors) {
            if (sensor.isOn() == false) {
                atLeastOneIsOff = true;
            }
        }
        if (atLeastOneIsOff == true) {
            return false;
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : this.sensors) {

            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {

        if (this.isOn() == false) {
            throw new IllegalArgumentException("Avg sensor is off - can't read");
        }
        double sum = 0;
        int c = 0;

        for (Sensor sensor : this.sensors) {
            sum += sensor.read();
            c++;
        }
        int avg = (int) sum / c;
        this.readings.add(avg);
        return avg;
    }

    public List<Integer> readings() {
        return this.readings;
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }
}
