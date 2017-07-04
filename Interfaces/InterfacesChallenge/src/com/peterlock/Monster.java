package com.peterlock;

import java.util.ArrayList;

/**
 * Created by macbookpro on 7/2/2017 AD.
 */
public class Monster implements ISaveable {

    private String name;
    private String weapon;
    private String abilities;
    private int level;


    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Monster(String name) {
        this.name = name;
        this.weapon = "No weapon attached";
        this.abilities = "No abilities added";
        this.level = 0;

    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", \nWeapon='" + weapon + '\'' +
                ", \nAbilities='" + abilities + '\'' +
                ", \nLevel=" + level;
    }

    @Override
    public ArrayList<String> write() {

        ArrayList<String> arrayToWrite = new ArrayList<String>();

        arrayToWrite.add(0, this.name);
        arrayToWrite.add(1, this.weapon);
        arrayToWrite.add(2, this.abilities);
        arrayToWrite.add(3, "" + this.level);

        return arrayToWrite;
    }

    @Override
    public void read(ArrayList<String> savedValues) {

        this.name = savedValues.get(0);
        this.weapon = savedValues.get(1);
        this.abilities = savedValues.get(2);
        this.level =  Integer.parseInt(savedValues.get(3));

    }
}
