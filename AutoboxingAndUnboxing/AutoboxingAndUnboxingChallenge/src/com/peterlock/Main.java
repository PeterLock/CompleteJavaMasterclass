package com.peterlock;

import java.util.Scanner;

/**
 * Created by macbookpro on 6/29/2017 AD.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("First National Bank");

    public static void main(String[] args) {
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
        boolean quit = false;
        printOptions();
        while(!quit){

            System.out.println("\nEnter action: (7 to show available options)\n");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;
                case 1:
                    addBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    addTransaction();
                    break;
                case 4:
                    printTransactions();
                    break;
                case 5:
                    bank.printBranches();
                    break;
                case 6:
                    printBranchCustomers();
                    break;
                case 7:
                    printOptions();
                    break;
            }
        }

    }

    private static void printBranchCustomers() {
        Branch branch = getBranch();
        if(branch != null){

            branch.printAllCustomers();

        }
    }

    private static void printTransactions() {
        Branch branch = getBranch();
        if(branch != null){

            System.out.println("Enter customers name: ");
            String customerName = scanner.nextLine();
            if(findCustomer(branch, customerName)){

                Customer customer = branch.getCustomer(customerName);

                customer.printAllTransactions();

            } else{
                System.out.println("Customer not on file");
            }

        } else{
            System.out.println("Branch not on file");
        }
    }

    private static void addTransaction() {
        Branch branch = getBranch();
        if(branch != null){

            System.out.println("Enter customers name: ");
            String customerName = scanner.nextLine();
            if(findCustomer(branch, customerName)){

                Customer customer = branch.getCustomer(customerName);
                System.out.println("Enter transation amount: ");
                Double transactionAmount = Double.parseDouble(scanner.nextLine());
                if(transactionAmount > 0){
                    customer.addTransaction(transactionAmount);
                    System.out.println("\nTransaction successful:\n");
                    System.out.println("\tName: " + customer.getName());
                    System.out.println("\tAmount: " + transactionAmount);
                    System.out.println("\tNew Balance: " + customer.getBalance());
                }else{
                    System.out.println("Unable to complete transaction");
                }
            } else{
                System.out.println("Customer not on file");
            }

        } else{
            System.out.println("Branch not on file");
        }
    }

    private static boolean findCustomer(Branch branch, String customerName) {
        Customer checkedCustomer = branch.getCustomer(customerName);
        if(checkedCustomer != null){
            return true;
        } else{
            return false;
        }
    }

    private static void addCustomer() {
        Branch foundBranch = getBranch();
        if(foundBranch != null){

            System.out.println("Enter customers name: ");
            String name = scanner.nextLine();
            System.out.println("Enter initial balance: ");
            Double initialBalance = Double.parseDouble(scanner.nextLine());

            foundBranch.addCustomer(name, initialBalance);

        } else{
            System.out.println("Branch not on file");
        }
    }

    private static Branch getBranch(){
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        Branch foundBranch = bank.findBranch(branchName);
        return foundBranch;
    }

    private static void addBranch() {
        System.out.println("Enter branch name: ");
        String newBranch = scanner.nextLine();
        if(newBranch != null){
            bank.addBranch(new Branch(newBranch));
        } else{
            System.out.println("Nothing to add");
        }
    }

    private static void printOptions() {
        System.out.println("\nAvailable menu options:\npress");
        System.out.println("\t0 - to exit application\n" +
                           "\t1 - to add a branch\n" +
                           "\t2 - to add a customer\n" +
                           "\t3 - to add a transaction\n" +
                           "\t4 - to print transactions\n" +
                           "\t5 - to print branches\n" +
                           "\t6 - to print branch customers\n" +
                           "\t7 - to print a list of available options");

        System.out.println("Choose your action: ");
    }
}
