package com.egecius.databindingdemo

import android.databinding.DataBindingUtil
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.egecius.databindingdemo.databinding.ActivityViewModelBinding


class ViewModelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)

//        val viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)

        val binding : ActivityViewModelBinding = DataBindingUtil.setContentView(this, R.layout.activity_view_model)
//        binding.viewModel = viewModel
    }

}
