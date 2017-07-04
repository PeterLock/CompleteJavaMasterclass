package com.peterlock;

/**
 * Created by macbookpro on 7/2/2017 AD.
 */
public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Im not very good at that, can I go for a swim instead?");
    }
}
