package com.egecius.databindingdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.egecius.databindingdemo.databinding.ActivityViewModelBinding


class ViewModelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)

        val binding : ActivityViewModelBinding = DataBindingUtil.setContentView(this, R.layout.activity_view_model)
        binding.viewModel = viewModel
        binding.myString = "Egis set from a variable outside of ViewModel"
    }
}
