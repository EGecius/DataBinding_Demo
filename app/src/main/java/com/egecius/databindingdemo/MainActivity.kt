package com.egecius.databindingdemo

import android.databinding.DataBindingUtil
import android.databinding.ObservableInt
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import com.egecius.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.user = User("My first name", "My last name")

        setupButton()
    }

    private fun setupButton() {
        findViewById<Button>(R.id.increment_button).setOnClickListener {

            val counter: ObservableInt? = binding.user?.counter
            counter?.set(counter.get() + 1)

            Log.i("Eg:MainActivity:30", "setupButton counter.get() " + counter?.get())
        }
    }
}
