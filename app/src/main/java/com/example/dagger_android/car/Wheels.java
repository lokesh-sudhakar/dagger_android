package com.example.dagger_android.car;

/**
 * @author Lokesh chennamchetty
 * @date 12/09/2020
 */
/**
 * Think like this is third party library
 * */


public class Wheels {

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires){
        this.rims = rims;
        this.tires = tires;
    }
}
