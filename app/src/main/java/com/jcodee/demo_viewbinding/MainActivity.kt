package com.jcodee.demo_viewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jcodee.demo_viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvText.text = getString(R.string.str_hello)
        otherMethod()
    }

    private fun otherMethod() {
        binding.tvButton.text = getString(R.string.str_my_button)
    }
}