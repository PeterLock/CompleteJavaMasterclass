package com.peterlock;

/**
 * Created by macbookpro on 7/2/2017 AD.
 */
public abstract class Bird extends Animal implements CanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void east() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
