package com.peterlock;

import java.util.ArrayList;

/**
 * Created by macbookpro on 7/3/2017 AD.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//        items.add("Peter");
        items.add(6);
        items.add(7);
        items.add(8);

        printDoubled(items);

    }

    private static void printDoubled(ArrayList<Integer> n) {
        for(Object i : n){
            System.out.println((Integer) i * 2);
        }
    }
}
