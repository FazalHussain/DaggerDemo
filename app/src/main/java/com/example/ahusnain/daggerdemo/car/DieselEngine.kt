package com.example.ahusnain.daggerdemo.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {

    val TAG = "Car"

    override fun start() {
        Log.d(TAG, "Disel Engine Started");
    }
}