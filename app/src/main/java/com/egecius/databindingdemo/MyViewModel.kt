package com.egecius.databindingdemo

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    val firstName = ObservableField("Egis")
    val lastName = ObservableField("Gecius")
    val counter = ObservableInt()

    fun increment() {
        counter.increment()
    }

    private fun ObservableInt.increment() {
        set(get() + 1)
    }
}
