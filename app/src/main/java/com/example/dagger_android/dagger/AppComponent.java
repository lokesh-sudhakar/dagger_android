package com.example.dagger_android.dagger;

import com.example.dagger_android.dagger.modules.DriverModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * @author Lokesh chennamchetty
 * @date 13/09/2020
 */
/**
 * we use singleton annotaion on component because its outer most scope and give single ton instances
 * **/

/**
 * Why to use multiple custom scope annotations?
 * why can't we use same annotations across all components
 *
 * ans-> One reason is to make sure that we put right module in the right component
 *      for eg - By making sure that component and the object has same annotations then
 *               the single instance will have scope that component
 *       Two -  to define different scope like activity scope and application scope etc..
 *
 *
 * **/


@Singleton
@Component(modules = {DriverModule.class})
public interface AppComponent {


    /**
     * Usage of subComponent
     * When we use sub component we have the explicitly define
     * the sub component type in the parent component
     *
     * its like class within class so child class can access the parent class variables
     * hence we don't need to explicitly mention Driver in app component as  activity
     * component can get it from module
     *
     * We need to pass the parameter to this sub component
     * they are non-abstract modules used by sub component
     * if the module used is abstract then we don't have to pass it in parameter
     * for now we are passing DieselEngine module as it is not abstract module used by activity component
     * **/
    ActivityComponent.Factory getActivityComponentBuilder();


    @Component.Builder
    interface Builder{

        AppComponent build();

        Builder driverModule(DriverModule driverModule);
    }

}


/**
 * Component Dependency
 *
 *1. using dependency
 *2. being a sub component
 *
 *Difference
 * 1. For subComponent dependency, The sub component can access all the modules of the parent component
 *    where as in component dependency Parent component has to explicitly define the Object at method in
 *    Component class else dependent component can not access
 *    eg Driver getDriver() in component class
 *
 * 2. Uses Component.Builder
 *    Uses SubComponent.Builder
 *
 * 3. In Component Dependencies, We need to inject parent component as a setter in Component.Builder
 *    In a subComponent dependency we need need to inject as sub
 *    component can access parent component modules
 *
 *    In sub component dependency it can become ted
 *
 *
 *
 * **/
