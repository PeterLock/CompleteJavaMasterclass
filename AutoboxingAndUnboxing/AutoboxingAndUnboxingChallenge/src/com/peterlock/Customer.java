package com.peterlock;

import java.util.ArrayList;

/**
 * Created by macbookpro on 6/29/2017 AD.
 */
public class Customer {
    // You job is to create a simple banking application.
    // There should be a Bank class
    // It should have an arraylist of Branches
    // Each Branch should have an arraylist of Customers
    // The Customer class should have an arraylist of Doubles (transactions)
    // Customer:
    // Name, and the ArrayList of doubles.
    // Branch:
    // Need to be able to add a new customer and initial transaction amount.
    // Also needs to add additional transactions for that customer/branch
    // Bank:
    // Add a new branch
    // Add a customer to that branch with initial transaction
    // Add a transaction for an existing customer for that branch
    // Show a list of customers for a particular branch and optionally a list
    // of their transactions
    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions
    private ArrayList<Double> transactions;
    private Double accountBalance;
    private String name;


    public Customer(String name, Double initialAmount) {
        this.name = name;
        this.accountBalance = 0.0;
        this.transactions = new ArrayList<Double>();

        addTransaction(initialAmount);

    }

    public String getName() {
        return name;
    }

    public void addTransaction(double amount) {
        if(amount >= 0){
            this.transactions.add(Double.valueOf(amount));
        }else{
            System.out.println("Cannot add negative tranactions");
        }
    }

    public double getBalance(){
        this.accountBalance = 0.0;
        for(int i = 0; i < this.transactions.size(); i++){
            this.accountBalance+= this.transactions.get(i);
        }
        return this.accountBalance;
    }

    public void printAllTransactions() {
        for(int i = 0; i < this.transactions.size(); i++){
            System.out.println("\t" + (i+1) + ". " + this.transactions.get(i));
        }
    }
}
