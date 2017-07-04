package com.peterlock;

/**
 * Created by macbookpro on 6/26/2017 AD.
 */

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(int cylinders, String name) {
        this.wheels = 4;
        this.engine = true;
        this.name = name;
        this.cylinders = cylinders;
    }

    public String getCylinders() {
        return name + " has " + cylinders + " cylinders";
    }

    public String getWheels() {
        return name + " has " + wheels + " wheels";
    }

    public String getName() {
        return "Generic vehicle";
    }

    public String startEngine(){
        return "Car -> start engine";
    }

    public String accelerate(){
        return "Car -> accelerate";
    }

    public String brake(){
        return "Car -> break";
    }
}

class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> start engine";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> break";
    }
}

class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "-> start engine";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerate";
    }

    @Override
    public String brake() {
        return "Holden -> break";
    }
}

class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> start engine";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate";
    }

    @Override
    public String brake() {
        return "Ford -> break";
    }
}

public class Main {

    // We are going to go back to the car analogy.
    // Create a base class called Car
    // It should have a few fields that would be appropriate for a generice car calss.
    // engine, cylinders, wheels, etc.
    // Constructor should initialize cylinders (number of) and name, and set wheels to 4
    // and engine to true. Cylinders and names would be passed parameters.
    //
    // Create appropriate getters
    //
    // Create some methods like startEngine, accelerate, and brake
    //
    // show a message for each in the base class
    // Now create 3 sub classes for your favorite vehicles.
    // Override the appropriate methods to demonstrate polymorphism in use.
    // put all classes in the one java file (this one).



    public static void main(String[] args) {

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(8, "Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(8, "Ford XR8 ");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(8, "Holden Commodore ");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

    }
}
