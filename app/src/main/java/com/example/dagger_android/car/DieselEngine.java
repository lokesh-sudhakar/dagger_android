package com.example.dagger_android.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * @author Lokesh chennamchetty
 * @date 13/09/2020
 */
public class DieselEngine implements Engine {

    private static final String TAG = "Car";
    private  int horsePower;

    @Inject
    public DieselEngine(int horsePower){
        this.horsePower = horsePower;
    }

    @Override
    public void start() {

        Log.d(TAG, "start: Diesel engine started Horse power :"+horsePower);
    }
}
