package com.peterlock;

import java.util.Scanner;

/**
 * Created by macbookpro on 6/28/2017 AD.
 */
public class Main {


    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("000000000");

    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contact (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contact
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.
        boolean quit = false;
        startPhone();
        printAction();
        while(!quit){
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("\nShutting down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printAction();
                    break;
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name, number);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: " + name + ", phone = " + number);
        } else{
            System.out.println("Cant add, " + name + ", already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number:");
        String newNumber = scanner.nextLine();
        Contact newConact = new Contact(newName, newNumber);
        if(mobilePhone.uodateContact(existingContactRecord, newConact)){
            System.out.println("Successfully updated record");
        } else{
            System.out.println("Error updating record");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
        }

       if(mobilePhone.removeContact(existingContactRecord)){
           System.out.println("Successfully removed contact");
       } else{
           System.out.println("Error deleting contact");
       }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());

    }

    private static void printAction() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                           "2 - to add a new contact\n" +
                           "3 - to update an existing contact\n" +
                           "4 - to remove existing contact\n" +
                           "5 - query if an existing contact exists\n" +
                           "6 - to print a list of available actions");

        System.out.println("Choose your action: ");
    }

    private static void startPhone() {
        System.out.println("Starting phone . . .");
    }
}
