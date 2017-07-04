package com.peterlock;

/**
 * Created by macbookpro on 7/4/2017 AD.
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
