package com.peterlock;

/**
 * Created by macbookpro on 6/27/2017 AD.
 */
public class Phone {
    private String number;
    private String name;
    private boolean ringing;

    public Phone(String number, String name) {
        this.number = number;
        this.name = name;
        this.ringing = false;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public boolean isRinging() {
        return ringing;
    }
}
