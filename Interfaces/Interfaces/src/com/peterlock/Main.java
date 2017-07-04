package com.peterlock;

/**
 * Created by macbookpro on 7/2/2017 AD.
 */
public class Main {

    public static void main(String[] args) {
        ITelephone petersPhone;
        petersPhone = new DeskPhone(123456);

        petersPhone.powerOn();
        petersPhone.callPhone(123456);
        petersPhone.answer();;


        petersPhone = new MobilePhone(234567);
        petersPhone.powerOn();
        petersPhone.callPhone(234567);
        petersPhone.answer();
    }
}
