package com.cha1se.dagger2samplee

import dagger.Component

@Component
interface ShowAllCars {

    fun getAllCars() : AllCars

}