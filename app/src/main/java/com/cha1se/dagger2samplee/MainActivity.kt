package com.cha1se.dagger2samplee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var showAll: ShowAllCars = DaggerShowAllCars.create()

        var allCars: AllCars = showAll.getAllCars()

        allCars.goAll()
        allCars.beepAll()
    }
}