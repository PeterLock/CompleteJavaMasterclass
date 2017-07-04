package com.peterlock;

import java.util.Scanner;

/**
 * Created by macbookpro on 6/27/2017 AD.
 */
public class Main {
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
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        MobilePhone mp = new MobilePhone();
        mp.setUpPhone("123-000-000");

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.print("Enter your choice: ");

            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch(NumberFormatException e){
                System.out.println("\n\tNot a valid number");
                choice = 0;
            }

            switch(choice){

                case 0:{
                    printInstructions();
                    break;
                }
                case 1:{
                    Contact contact = getContact();
                    boolean findContact = mp.addNewContact(contact);
                    if(findContact){
                        System.out.println("Contact successfully added");
                    }
                    break;
                }
                case 2:{
                    String contactName = getContactName();

                    if(mp.findContact(contactName)){
                        System.out.print("Enter number: ");
                        String newNumber = scanner.nextLine();

                        if(mp.updateContact(contactName, newNumber)){
                            System.out.println("Number change successful");
                        } else{
                            System.out.println("Number change unsuccessful ");
                        }
                    } else{
                        System.out.println("Contact not on file");
                    }
                    break;
                }
                case 3:{
                    String contactName = getContactName();

                    if(mp.findContact(contactName)){
                        if(mp.removeContact(contactName)){
                            System.out.println("Contact removed");
                        } else{
                            System.out.println("Contact not removed");
                        }
                    } else{
                        System.out.println("Contact not on file");
                    }
                    break;
                }
                case 4:{
                    String contactName = getContactName();

                    if(!(mp.searchContact(contactName))){
                        System.out.println("Contact not on file");
                    }
                    break;
                }
                case 5:{
                    mp.printContacts();
                    break;
                }
                case 6:{
                    quit = true;
                    break;
                }
            }
        }
        System.out.println("\nThank-you");
        scanner.close();
    }

    private static String getContactName() {
        System.out.print("Enter name: ");
        return scanner.nextLine();
    }

    private static Contact getContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter number: ");
        String number = scanner.nextLine();
        return new Contact(name, number);
    }

    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To add contact");
        System.out.println("\t 2 - To update contact");
        System.out.println("\t 3 - To remove contact");
        System.out.println("\t 4 - To search contact list");
        System.out.println("\t 5 - To print contacts");
        System.out.println("\t 6 - To quit the application");
    }
}