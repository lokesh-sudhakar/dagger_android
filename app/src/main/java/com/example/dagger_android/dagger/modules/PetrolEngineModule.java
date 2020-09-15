package com.example.dagger_android.dagger.modules;

import com.example.dagger_android.car.Engine;
import com.example.dagger_android.car.PetrolEngine;

import dagger.Module;
import dagger.Provides;

/**
 * @author Lokesh chennamchetty
 * @date 13/09/2020
 */

@Module
public  class PetrolEngineModule {


    @Provides
    Engine providesPetrolEngine(PetrolEngine petrolEngine){
        return petrolEngine;
    }
}
