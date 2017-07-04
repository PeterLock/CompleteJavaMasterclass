package com.peterlock;

/**
 * Created by macbookpro on 7/2/2017 AD.
 */
public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone is powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("No ringing " + phoneNumber + " on mobile phone");
            isRinging = false;
        }

    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Melody playing");
        }else{
            isRinging = false;
            System.out.println("Mobile phone is not on or number is different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
