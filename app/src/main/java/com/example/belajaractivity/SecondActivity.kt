package com.example.belajaractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajaractivity.databinding.SecondactivityMainBinding


class SecondActivity : AppCompatActivity() {
    private lateinit var binding: SecondactivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondactivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}