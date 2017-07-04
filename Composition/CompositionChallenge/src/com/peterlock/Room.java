package com.peterlock;

/**
 * Created by home-folder on 6/24/17.
 */
public class Room {
    private int walls;
    private int windows;
    private int doors;
    private String name;
    private String flooringType;

    private Dimensions dimenstions;

    public Room(int walls, int windows, int doors, String name, String flooringType, Dimensions dimenstions) {
        this.walls = walls;
        this.windows = windows;
        this.doors = doors;
        this.name = name;
        this.flooringType = flooringType;
        this.dimenstions = dimenstions;
    }

    public int getWalls() {
        return walls;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public String getName() {
        return name;
    }

    public String getFlooringType() {
        return flooringType;
    }

    public Dimensions getDimenstions() {
        return dimenstions;
    }
}
