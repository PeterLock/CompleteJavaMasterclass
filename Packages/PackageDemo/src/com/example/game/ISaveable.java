package com.example.game;

import java.util.List;

/**
 * Created by macbookpro on 7/2/2017 AD.
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
