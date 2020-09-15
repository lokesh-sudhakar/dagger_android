package com.example.dagger_android.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * @author Lokesh chennamchetty
 * @date 13/09/2020
 */
public class Rims {

    private static final String TAG = "Car";

    @Inject
    public Rims(){

    }


    public void drive() {
        Log.d(TAG, "rims "+this);
    }
}
