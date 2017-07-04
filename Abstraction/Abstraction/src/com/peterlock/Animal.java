package com.peterlock;

/**
 * Created by macbookpro on 7/2/2017 AD.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void east();
    public abstract void breathe();

    public String getName(){
        return name;
    }
}
