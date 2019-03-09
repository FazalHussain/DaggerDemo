package com.example.ahusnain.daggerdemo.dagger

import com.example.ahusnain.daggerdemo.MainActivity
import com.example.ahusnain.daggerdemo.car.Car
import dagger.Component

/**
 * Component interface that is responsible for creating dependency graph.
 */

@Component (modules = arrayOf(WheelModule::class, DieselEngineModule::class))
interface CarComponent {
    /**
     * Component just create car object on thier end and provide a car
     * object at compile time instead of creating object at
     * run time to avoid crashed and low performance.
     *
     * @return [Car] object
     */
    fun getCar() : Car

    fun inject(mainActivity: MainActivity)
}