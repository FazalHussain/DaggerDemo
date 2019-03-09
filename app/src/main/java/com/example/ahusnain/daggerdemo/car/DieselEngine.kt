package com.example.ahusnain.daggerdemo.car

import android.util.Log
import javax.inject.Inject

class DieselEngine constructor(horsePower: Int) : Engine {

    val TAG = "Car"
    var horsePower: Int = 0

    init {
        this.horsePower = horsePower
    }

    override fun start() {
        Log.d(TAG, "Disel Engine Started. Horsepower: $horsePower")
    }
}