package com.example.firstproject

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgSb1.setOnClickListener()
        {
            Toast.makeText(context: this, text:"Soy latte", Toast.LENGTH_SHORT).show()
        }
        binding.imgSb2.setOnClickListener()
        {
            Toast.makeText(context: this, text:"Choco Frapp", Toast.LENGTH_SHORT).show()
        }
        binding.imgSb3.setOnClickListener()
        {
            Toast.makeText(context: this, text:"Bottled Americano", Toast.LENGTH_SHORT).show()
        }
        binding.imgSb4.setOnClickListener()
        {
            Toast.makeText(context: this, text:"Rainbow Latte", Toast.LENGTH_SHORT).show()
        }
        binding.imgSb5.setOnClickListener()
        {
            Toast.makeText(context: this, text:"Caremel Frapp", Toast.LENGTH_SHORT).show()
        }
        binding.imgSb6.setOnClickListener()
        {
            Toast.makeText(context: this, text:"Black Forest Frapp", Toast.LENGTH_SHORT).show()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}