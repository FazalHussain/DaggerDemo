package com.example.ahusnain.daggerdemo.dagger

import com.example.ahusnain.daggerdemo.car.Engine
import com.example.ahusnain.daggerdemo.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(petrolEngine: PetrolEngine) : Engine
}