package com.jcodee.demo_viewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jcodee.demo_viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Declare variable of type view binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Call component from these view
        binding.tvText.text = "Hello"
        otherMethod()
    }

    private fun otherMethod() {
        binding.tvButton.text = "My Button"
    }
}