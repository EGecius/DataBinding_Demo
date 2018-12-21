package com.egecius.databindingdemo

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.egecius.databindingdemo.databinding.ActivityMainBinding

class ObservableFieldActivity : AppCompatActivity() {

    private val user = User("My first name", "My last name")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* ActivityMainBinding is generated code */
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.user = user

        setupButton()
    }

    private fun setupButton() {
        findViewById<Button>(R.id.increment_button).setOnClickListener {
            val counter = user.counter
            counter.set(counter.get() + 1)
        }
    }
}
