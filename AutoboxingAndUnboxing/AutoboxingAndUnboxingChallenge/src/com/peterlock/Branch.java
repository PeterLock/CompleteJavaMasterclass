package com.peterlock;

import java.util.ArrayList;

/**
 * Created by macbookpro on 6/29/2017 AD.
 */
public class Branch {
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
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addCustomer(String customerName, Double intialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, intialAmount));
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i = 0; i < this.customers.size(); i++){
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }

    public boolean addTransaction(Customer customer, Double transactionAmount){
        if(this.customers.contains(customer)){
            int position = this.customers.indexOf(customer);
            customers.get(position).addTransaction(transactionAmount);
            return true;
        }
        return false;
    }

    public boolean showCustomerTransactions(Customer customer){
        Customer checkedCustomer = findCustomer(customer.getName());
        if(checkedCustomer != null){
            System.out.println("Branch -> showCustomerTransactions");
        }
        return false;
    }

    public Customer getCustomer(String customerName) {
        for(int i = 0; i < this.customers.size(); i++){
            String checkedName = this.customers.get(i).getName();
            if(checkedName.equals(customerName)){
                return this.customers.get(i);
            }
        }
        return null;
    }

    public void printAllCustomers() {
        System.out.println("\n" + this.name + " has the following customers:\n");
        for(int i = 0; i < this.customers.size(); i++){
            System.out.println(this.customers.get(i).getName());
        }
    }
}
