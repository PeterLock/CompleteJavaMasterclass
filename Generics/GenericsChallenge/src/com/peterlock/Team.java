package com.peterlock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macbookpro on 7/4/2017 AD.
 */
public class Team<T extends Player> implements Comparable<T> {

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


    private String name;
    private int wins;
    private int loss;
    private int ties;

    private List<T> members;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }


    public boolean addPlayer(T player){
        if(!this.members.contains(player)){
            this.members.add(player);
            System.out.println(player.getName() + " picked for the team " + this.name);
            return true;
        }
        System.out.println(player.getName() + " is already on the team " + this.name);
        return false;
    }

    public int numberOfPlayers(){
        return this.members.size();
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
