package com.peterlock;

/**
 * Created by home-folder on 6/24/17.
 */
public class Bathroom extends Room {
    private BathTub bathTub;
    private Light light;
    private String style;

    public Bathroom(int walls, int windows, int doors, String name, String flooringType, Dimensions dimenstions, BathTub bathTub, Light light, String style) {
        super(walls, windows, doors, name, flooringType, dimenstions);
        this.bathTub = bathTub;
        this.light = light;
        this.style = style;
    }

    public void switchOnLight(){
        light.turnOn();
    }

    public void switchOffLight(){
        light.turnOff();
    }

    public BathTub getBathTub() {
        return bathTub;
    }

    public Light getLight() {
        return light;
    }

    public String getStyle() {
        return style;
    }
}
