package com.example.dagger_android.car;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Lokesh chennamchetty
 * @date 13/09/2020
 */

public class Driver {

    //imageine we dont own this class
    String name;

    public Driver(String name){
        this.name = name;
    }

}
