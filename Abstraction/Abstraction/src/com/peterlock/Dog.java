package com.peterlock;

/**
 * Created by macbookpro on 7/2/2017 AD.
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void east() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }
}
