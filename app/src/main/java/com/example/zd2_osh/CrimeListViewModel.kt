package com.example.zd2_osh

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {

    val crimes = mutableListOf<Crime>()

    init {
        for (i in 0..100) {
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved
        }
    }
}