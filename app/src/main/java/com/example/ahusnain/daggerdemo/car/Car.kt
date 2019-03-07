package com.example.ahusnain.daggerdemo.car

import android.util.Log
import javax.inject.Inject

class Car {

    val TAG = "Car"

    var engine: Engine
    var wheels: Wheels

    @Inject
    constructor(engine: Engine, wheels: Wheels) {
        this.engine = engine
        this.wheels = wheels
    }

    /**
     * Drive car
     */
    fun drive() {
        engine.start()
        Log.d(TAG, " Car Driving...")
    }

}
