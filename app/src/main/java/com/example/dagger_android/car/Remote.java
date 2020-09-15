package com.example.dagger_android.car;

import android.util.Log;

import com.example.dagger_android.car.Car;

import javax.inject.Inject;

/**
 * @author Lokesh chennamchetty
 * @date 13/09/2020
 */
public class Remote {

    private static final String TAG = "Remote";

    @Inject
    public Remote(){

    }

    public void setListener(Car car) {
        Log.d(TAG, "setListener: remote connected");
    }

}
