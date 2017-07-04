package com.peterlock;

import java.util.ArrayList;

/**
 * Created by macbookpro on 6/29/2017 AD.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public ArrayList<Double> getTransations() {
        return transactions;
    }
}
