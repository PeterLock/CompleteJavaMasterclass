package com.peterlock;

import java.util.ArrayList;

/**
 * Created by macbookpro on 6/29/2017 AD.
 */
public class Bank {
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
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
        addBranch(new Branch("Center City"));
    }

    public String getName() {
        return name;
    }

    public void addBranch(){
        System.out.println("Bank -> addBranch");
    }

    public boolean addBranch(Branch newBranch){
        if(findBranch(newBranch.getName()) == null){
            this.branches.add(newBranch);
            return true;
        }
        return false;
    }

    public Branch findBranch(String branchName) {
      for(int i = 0; i < this.branches.size(); i++){
          Branch checkedBranch =this.branches.get(i);
          if(checkedBranch.getName().equals(branchName)){
              return checkedBranch;
          }
      }
      return null;
    }

    public void printBranches(){
        System.out.println(this.name + " has the following branches:");
        for(int i = 0; i < this.branches.size(); i++){
            System.out.println((i+1) + ". " + this.branches.get(i).getName());
        }
    }
}
