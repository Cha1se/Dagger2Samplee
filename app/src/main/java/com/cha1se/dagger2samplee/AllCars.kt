package com.cha1se.dagger2samplee

import javax.inject.Inject

class AllCars {

    private lateinit var cabroilet: Cabroilet
    private lateinit var niva: Niva

    @Inject constructor(cabroilet: Cabroilet, niva: Niva) {
        this.cabroilet = cabroilet
        this.niva = niva
    }

    fun beepAll() {
        cabroilet.beep()
        niva.beep()
    }

    fun goAll() {
        cabroilet.goo()
        niva.goo()
    }

}