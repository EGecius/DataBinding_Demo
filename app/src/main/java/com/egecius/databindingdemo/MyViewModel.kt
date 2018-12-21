package com.egecius.databindingdemo

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField

class MyViewModel : ViewModel() {

    val firstName = ObservableField("Egis")
    val lastName = ObservableField("Gecius")
}
