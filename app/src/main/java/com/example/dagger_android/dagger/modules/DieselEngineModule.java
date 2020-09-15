package com.example.dagger_android.dagger.modules;

import com.example.dagger_android.car.DieselEngine;
import com.example.dagger_android.car.Engine;

import dagger.Module;
import dagger.Provides;

/**
 * @author Lokesh chennamchetty
 * @date 13/09/2020
 */

@Module
public  class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower(){
        return horsePower;
    }


    /**
     * Use binds instead of @provides when ever you want to bind an implementation to an interface
     * when we use bind dagger does not implement the method
     * it will only instantiate the Diesel Engine object
     * **/
    @Provides
    Engine provideDieselEngine(DieselEngine dieselEngine) {
        return  dieselEngine;
    }
}
