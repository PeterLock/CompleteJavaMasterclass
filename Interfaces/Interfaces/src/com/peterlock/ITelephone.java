package com.peterlock;

/**
 * Created by macbookpro on 7/2/2017 AD.
 */
public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
