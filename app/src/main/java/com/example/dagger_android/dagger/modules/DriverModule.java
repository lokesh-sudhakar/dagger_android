package com.example.dagger_android.dagger.modules;

import com.example.dagger_android.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Lokesh chennamchetty
 * @date 13/09/2020
 */
@Module
public  class DriverModule {

    String name;

    public DriverModule(String name){
        this.name = name;
    }


    @Singleton
    @Provides
    Driver provideDriver(){
        return  new Driver(name);
    }
}
