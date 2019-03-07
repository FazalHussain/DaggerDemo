package com.example.ahusnain.daggerdemo.car

import android.util.Log

class Tires(var brand: String) {

    init {
        Log.d("Car", "Tires brand is: $brand")
    }
}