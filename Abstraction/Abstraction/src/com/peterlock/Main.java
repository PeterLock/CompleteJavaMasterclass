package com.peterlock;

/**
 * Created by macbookpro on 7/2/2017 AD.
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.east();


        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.east();
        parrot.fly();

        Penguin penguin = new Penguin("Emmperor");
        penguin.fly();
    }
}
