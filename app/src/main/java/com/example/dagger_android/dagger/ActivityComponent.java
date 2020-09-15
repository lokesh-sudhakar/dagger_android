package com.example.dagger_android.dagger;



/**
 * @author Lokesh chennamchetty
 * @date 12/09/2020
 */

import com.example.dagger_android.MainActivity;
import com.example.dagger_android.annotation.ActivitySingleton;
import com.example.dagger_android.car.Car;
import com.example.dagger_android.car.Rims;
import com.example.dagger_android.dagger.modules.DieselEngineModule;
import com.example.dagger_android.dagger.modules.PetrolEngineModule;
import com.example.dagger_android.dagger.modules.WheelsModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

/**component creates and stores our objects and
Directed Acyclic graph  hence called dagger
 Dagger 2 - uses annotaion processing which generates code in compile time
            - has compile time verification
 gets rid of reflection as it is runtime
 @Component -> at compile time it implement the interface and creats all the necessary code
**/

/**
 * we use ActivitySingleton annotation on component because
 * its outer most scope and give ActivitySingleton instances
 * **/


@ActivitySingleton
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    /**
     * field injection
     * cannot pass super class like appcompat activity
     * we have to declare as main activity
     * name of method does not matter
     * we use field injects for fragments and activity as we cant instantiate them using constructor
     * **/
    void inject(MainActivity mainActivity);


    /**
     * Component builder is used to over ride the builder of the Dagger component
     *
     * define the methods of builder using @BindsInstance
     *
     * Used @Named() to specify the usage of the object.
     * normaly used when there is multiple objects of dame type
     *
     * builder method is normaly used to get the runtime values for instantiating the objects
     * like application context
     * **/
//    @Subcomponent.Builder
//    interface Builder{
//
//        @BindsInstance
//        Builder horsePower(@Named("horse_power") int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("engine_capacity")int engineCapacity);
//
//        ActivityComponent build();
//    }

    @Subcomponent.Factory
    interface  Factory{
        ActivityComponent create(@BindsInstance @Named("horse_power") int horsePower,
                                 @BindsInstance @Named("engine_capacity")int engineCapacity);
    }

}
