package com.peterlock;

/**
 * Created by macbookpro on 7/4/2017 AD.
 */
public class Main {
    public static void main(String[] args) {
        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.

        FootballPlayer peter = new FootballPlayer("Peter");
        TennisPlayer alisha = new TennisPlayer("Alisha");

        Team<FootballPlayer> essedon = new Team<>("Essedon");
        essedon.addPlayer(peter);
//        essedon.addPlayer(alisha);


        System.out.println("Essedon has " + essedon.numberOfPlayers());

    }
}
