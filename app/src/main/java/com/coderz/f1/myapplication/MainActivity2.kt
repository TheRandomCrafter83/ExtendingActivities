package com.coderz.f1.myapplication

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
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
                    showMessage("Hello from Activity 2")
                }
            }
        }

    }


}