package com.theatre;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       Theatre theatre = new Theatre("Olympian", 8, 12 );
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserved();
        if(theatre.reserveSeat("AO2")){
            System.out.println("Please pay for AO2");
        }else{
            System.out.println("Seat already reserved");
        }



    }

    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("===========================================================================================================");
    }
}
