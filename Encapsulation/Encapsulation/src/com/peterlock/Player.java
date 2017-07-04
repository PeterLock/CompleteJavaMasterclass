package com.peterlock;

/**
 * Created by home-folder on 6/25/17.
 */
public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health-damage;
        if(this.health <=0){
            System.out.println("Player knocked out");
            // Reduce number of live for the player
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
