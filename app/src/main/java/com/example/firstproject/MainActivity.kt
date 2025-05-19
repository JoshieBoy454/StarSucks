package com.example.firstproject

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firstproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageView.setOnClickListener()
        {
            Toast.makeText(this, "Soy latte", Toast.LENGTH_SHORT).show()
        }
        binding.imageView2.setOnClickListener()
        {
            Toast.makeText(this, "Choco Frapp", Toast.LENGTH_SHORT).show()
        }
        binding.imageView3.setOnClickListener()
        {
            Toast.makeText(this, "Bottled Americano", Toast.LENGTH_SHORT).show()
        }
        binding.imageView4.setOnClickListener()
        {
            Toast.makeText(this, "Rainbow Latte", Toast.LENGTH_SHORT).show()
        }
        binding.
            imageView5.setOnClickListener()
        {
            Toast.makeText(this, "Caremel Frapp", Toast.LENGTH_SHORT).show()
        }
        binding.imageView6.setOnClickListener()
        {
            Toast.makeText(this, "Black Forest Frapp", Toast.LENGTH_SHORT).show()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}