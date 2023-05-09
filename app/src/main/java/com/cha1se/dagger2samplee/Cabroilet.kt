package com.cha1se.dagger2samplee

import android.util.Log
import javax.inject.Inject

class Cabroilet @Inject constructor() : Car {

    override fun beep() {
        Log.e("BEEP ", this.javaClass.simpleName + " beeeep")
    }

    override fun goo() {
        Log.e("GO ", this.javaClass.simpleName + " is go")
    }

}