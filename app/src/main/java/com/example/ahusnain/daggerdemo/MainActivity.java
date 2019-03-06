package com.example.ahusnain.daggerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ahusnain.daggerdemo.car.Car;
import com.example.ahusnain.daggerdemo.dagger.CarComponent;
import com.example.ahusnain.daggerdemo.dagger.WheelModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.builder().
                wheelModule(WheelModule.INSTANCE).
                build();
        carComponent.inject(this);

        car.drive();
    }
}
