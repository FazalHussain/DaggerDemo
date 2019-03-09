package com.example.ahusnain.daggerdemo.dagger

import android.util.Log
import com.example.ahusnain.daggerdemo.car.DieselEngine
import com.example.ahusnain.daggerdemo.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(horsePower: Int) {

    var horsePower = 0
    init {
        this.horsePower = horsePower
    }

    @Provides
    fun provideEngine() : Engine {
        return DieselEngine(horsePower)
    }
}