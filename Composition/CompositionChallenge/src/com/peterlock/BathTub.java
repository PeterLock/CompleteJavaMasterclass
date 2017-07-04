package com.peterlock;

/**
 * Created by home-folder on 6/24/17.
 */
public class BathTub {
    private String type;
    private Dimensions dimensions;

    public BathTub(String type, Dimensions dimensions) {
        this.type = type;
        this.dimensions = dimensions;
    }

    public String getType() {
        return type;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
