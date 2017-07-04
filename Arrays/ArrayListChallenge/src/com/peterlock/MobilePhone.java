package com.peterlock;

import java.util.ArrayList;

/**
 * Created by macbookpro on 6/27/2017 AD.
 */
public class MobilePhone extends Phone {
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

    private String phoneNo;
    private ArrayList<Contact> myContacts;

    public MobilePhone() {
        super("No number assigend", "No name assigned");
    }

    public void setUpPhone(String myNumber){
        this.phoneNo = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }


    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) == true){
            System.out.println("Contact is already on file");
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public boolean findContact(String name) {
        for(Contact t: myContacts ){
            if(t.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public boolean updateContact(String contactName, String newNumber) {
        for(Contact t: this.myContacts){
            if(t.getName().equals(contactName)){
                t.setPhoneNumber(newNumber);
                return true;
            }
        }
        return false;
    }

    public boolean removeContact(String contactName) {
        for(Contact t: this.myContacts){
            if(t.getName().equals(contactName)){
                this.myContacts.remove(t);
                return true;
            }
        }
        return false;
    }

    public void printContacts() {
        System.out.println("\nContacts:\n");
        for(Contact t: this.myContacts){
            System.out.print("\t" + t.getName() + " (" + t.getPhoneNumber() + ")\n");
        }
        System.out.println();
    }

    public boolean searchContact(String contactName) {
        for(Contact t: this.myContacts){
            if(t.getName().equals(contactName)){
                System.out.print("\t" + t.getName() + " (" + t.getPhoneNumber() + ")\n");
                return true;
            }
        }
        return false;
    }
}
