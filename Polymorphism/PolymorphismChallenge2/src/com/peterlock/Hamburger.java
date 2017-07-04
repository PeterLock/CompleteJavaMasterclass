package com.peterlock;

/**
 * Created by macbookpro on 6/26/2017 AD.
 */
public class Hamburger {
    // We want to create a base hamburger, but also two other types of hamburgers that are popular ones in
    // Bills store.
    // The basic hamburger should have the following items.
    // bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
    // the customer can select to be added to the burger. Each one of these items gets charged an additional
    // price so you need some way to track how many items got added and to calculate the price (for the base
    // burger and all the additions).
    // This burger has a base price and the additions are all seperately priced.
    // Create a Hamburger class to deal with all the above.
    // The constructor should only include the roll type, meat and price.
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){

        double hamburgerPrice=this.price;

        System.out.println(this.name + " burger on  a " + this.breadRollType + " roll " +
                        " price is " + this.price);

        if(this.addition1Name != null){
            hamburgerPrice+= addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }

        if(this.addition2Name != null){
            hamburgerPrice+= addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }

        if(this.addition3Name != null){
            hamburgerPrice+= addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);

        }

        if(this.addition4Name != null){
            hamburgerPrice+= addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }

        return hamburgerPrice;
    }


}
