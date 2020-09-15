package com.example.dagger_android.car;

import android.util.Log;

import com.example.dagger_android.annotation.ActivitySingleton;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Order of injection
 * 1. constructor injectiom
 * 2. field injection
 * 3. method injection
 *
 *
 * Field & method injection is automatically done once we call a constructor injection
 * hence we don't need Dagger component to inject this
 *
 *
 * only use case of field injection is to pass a instance of class
 * **/



@ActivitySingleton
public class Car {

    private static final String TAG = "Car";

    @Inject
    Engine engine;
    private Wheels wheels;


    private Driver driver;

    /**
     * can be used only for single constructor
     * instead we can use method injection and one constructor injection
     * **/
    @Inject
    public Car(Driver driver,Wheels wheels) {
        this.driver = driver;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, driver+"drives "+this);
    }
}
