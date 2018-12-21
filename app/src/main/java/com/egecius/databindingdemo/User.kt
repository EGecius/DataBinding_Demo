package com.egecius.databindingdemo

import android.databinding.ObservableInt


data class User(val firstName: String, val lastName: String) {

    val counter = ObservableInt()
}