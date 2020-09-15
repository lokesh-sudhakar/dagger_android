package com.example.dagger_android;

import android.app.Application;

import com.example.dagger_android.dagger.AppComponent;
import com.example.dagger_android.dagger.DaggerAppComponent;
import com.example.dagger_android.dagger.modules.DriverModule;

/**
 * @author Lokesh chennamchetty
 * @date 13/09/2020
 */
public class App extends Application {

    static App instance;
    private AppComponent activityComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
//        activityComponent = DaggerActivityComponent.builder().horsePower(30)
//                .engineCapacity(20).build();
    }

    public AppComponent getAppComponent(){
        if (activityComponent ==null) {
            activityComponent = DaggerAppComponent.builder()
                    .driverModule(new DriverModule("hello"))
                    .build();
//            activityComponent = DaggerActivityComponent.builder().horsePower(30)
//                    .engineCapacity(20).build();
        }
        return activityComponent;
    }

    public static App getApplicationInstance(){
        return  instance;
    }


}
