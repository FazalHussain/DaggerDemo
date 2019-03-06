package com.example.ahusnain.daggerdemo

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
        Log.d(TAG, " Car Driving...")
    }

}
