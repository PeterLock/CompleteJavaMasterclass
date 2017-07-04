package com.peterlock;

/**
 * Created by home-folder on 6/24/17.
 */
public class Light {
    private String voltage;
    private String type;
    private boolean isOn;

    public Light(String voltage, String type, boolean isOn) {
        this.voltage = voltage;
        this.type = type;
        this.isOn = isOn;
    }

    public void turnOn(){
        this.isOn = true;
        System.out.println("Light has been turned on");
    }

    public void turnOff(){
        this.isOn = false;
        System.out.println("Light has been turned off");
    }

    public String getVoltage() {
        return voltage;
    }

    public String getType() {
        return type;
    }

    public boolean isOn() {
        return isOn;
    }
}
