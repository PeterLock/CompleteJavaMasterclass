package com.peterlock.challenge;

import java.util.Scanner;

/**
 * Created by macbookpro on 7/4/2017 AD.
 */
public class X {

    // Write a small program to read an integer from the keyboard
    // (using Scanner) and print out the times table for that number.
    // The table should run from 1 to 12.
    //
    // You are allowed to use one variable called scanner for your
    // Scanner instance. You can use as many other variables as you
    // need, but they must must all be called x. That includes any
    // class instances and loop control variables that you may decide
    // to use.
    //
    // If you use a class, the class can be called X (capital), but
    // any instances of it must be called x (lower case).
    //
    // Any methods you create must also be called x.
    //
    // Optional Extra:
    // Change your program so that ALL variables (including the scanner
    // instance) are called x.

    private int x;

    public X(Scanner x) {
        System.out.println("Please enter a number: ");
        this.x = x.nextInt();
    }

    public void x(){

        for(int x=1; x<this.x; x++){
            System.out.println(x + " times " + this.x + " equals " + x * this.x);
        }
    }
}
