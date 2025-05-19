package com.example.firstproject

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firstproject.databinding.ActivityMainBinding
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var database: FirebaseDatabase
     var order = Order()

    private lateinit var binding: ActivityMainBinding
    private lateinit var orderDAO: OrderDAO
    private lateinit var db: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        database = FirebaseDatabase.getInstance()

        binding.imageView.setOnClickListener(this)
        binding.imageView2.setOnClickListener(this)
        binding.imageView3.setOnClickListener(this)
        binding.imageView4.setOnClickListener(this)
        binding.imageView5.setOnClickListener(this)
        binding.imageView6.setOnClickListener(this)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.imageView -> order.productName = "Soy Latte"
            R.id.imageView2 -> order.productName = "Chocce Frapp"
            R.id.imageView3 -> order.productName = "Bottled Americano"
            R.id.imageView4 -> order.productName = "Rainbow Frapp"
            R.id.imageView5 -> order.productName = "Charamel Frapp"
            R.id.imageView6 -> order.productName = "Black Forest Frapp"
        }
        Toast.makeText(this@MainActivity,"MMM" + order.productName, Toast.LENGTH_SHORT).show()
        IntentHelper().openIntent(applicationContext, order.productName, OrderDetailsActivity::class.java)
    }
}