package com.coderz.f1.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coderz.f1.myapplication.base_activity.BaseActivity
import com.coderz.f1.myapplication.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            button.apply {
                setOnClickListener {
                    showMessage("Hello from Activity 1")
                }
            }
            button2.apply {
                setOnClickListener {
                    val intent:Intent = Intent(this@MainActivity,MainActivity2::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}