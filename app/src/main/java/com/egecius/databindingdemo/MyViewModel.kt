package com.egecius.databindingdemo

import android.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    val firstName = ObservableField("Egis")
    val lastName = ObservableField("Gecius")
}
