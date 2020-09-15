package com.example.dagger_android.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Lokesh chennamchetty
 * @date 13/09/2020
 */
public class PetrolEngine implements Engine {

    private static final String TAG = "Car";
    private  int horsePower;
    private int engineCapacity;


    @Inject
    public PetrolEngine(@Named("horse_power")  int horsePower,@Named("engine_capacity")  int engineCapacity){
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "start: petrol engine started: horse power: "+horsePower+"\n " +
                "engine capacity:"+engineCapacity);
    }
}
