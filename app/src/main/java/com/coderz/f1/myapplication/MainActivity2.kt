package com.coderz.f1.myapplication

import android.os.Bundle
import com.coderz.f1.myapplication.base_activity.BaseActivity
import com.coderz.f1.myapplication.databinding.ActivityMain2Binding

class MainActivity2 : BaseActivity() {


    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            button.apply {
                setOnClickListener {
                    //showMessage("Hello from Activity 2")
                }
            }
        }

    }


}