package com.example.ahusnain.daggerdemo.dagger

import com.example.ahusnain.daggerdemo.car.Rims
import com.example.ahusnain.daggerdemo.car.Tires
import com.example.ahusnain.daggerdemo.car.Wheels
import dagger.Module
import dagger.Provides

@Module
object WheelModule {

    @Provides
    fun provideRims() : Rims = Rims()

    @Provides
    fun provideTireBrand(): String = "General"

    @Provides
    fun provideTires(brand: String) : Tires = Tires(brand)

    @Provides
    fun provideWheels(rims: Rims, tires: Tires) : Wheels = Wheels(rims, tires)
}