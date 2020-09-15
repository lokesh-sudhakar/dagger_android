package com.example.dagger_android.dagger.modules;

import com.example.dagger_android.car.Rims;
import com.example.dagger_android.car.Tires;
import com.example.dagger_android.car.Wheels;
import com.example.dagger_android.dagger.AppComponent;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * @author Lokesh chennamchetty
 * @date 13/09/2020
 */

/**
 * Declare module as abstract if all the provides method is static
 * This will tell dagger not to instantiate the module class
 * and directly call the methods
 * */

@Module
public  class WheelsModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }


    @Provides
    static Tires provideTires(){
        return new Tires();
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }
}
