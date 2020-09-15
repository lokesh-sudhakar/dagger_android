package com.example.dagger_android;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger_android.car.Car;
import com.example.dagger_android.car.Rims;
import com.example.dagger_android.dagger.ActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    /**
     * for field injection we cant make fields private
     * because the component cant access this variable
     * it cannot be final as we want to change the value later
     * */


    @Inject
    Car car1,car2;


    @Inject
    Rims rims;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * create method is only available only when none of the modules
         * of the component takes arguments over constructor
         * eg - > DaggerCarComponent.create();
         * else ->
         *  DaggerCarComponent.builder()
         *                 .dieselEngineModule(new DieselEngineModule(10))
         *                 .build();
         * **/

        ActivityComponent activityComponent = App.getApplicationInstance().getAppComponent()
                .getActivityComponentBuilder().create(10,400);
        activityComponent.inject(this);
        rims.drive();
        car1.drive();
        car2.drive();
    }
}
