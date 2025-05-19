package com.example.firstproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firstproject.databinding.ActivityOrderDetailsBinding

class OrderDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOrderDetailsBinding
    private val order = Order()
    private val intentHelper = IntentHelper()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityOrderDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        order.productName = intent.getStringExtra("order").orEmpty()
        binding.tvPlacedOrder.text = order.productName

        when (order.productName) {
            "Soy Latte"         -> binding.imgOrderedBeverage.setImageResource(R.drawable.sb1)
            "Chocce Frapp"      -> binding.imgOrderedBeverage.setImageResource(R.drawable.sb2)
            "Bottled Americano" -> binding.imgOrderedBeverage.setImageResource(R.drawable.sb3)
            "Rainbow Frapp"     -> binding.imgOrderedBeverage.setImageResource(R.drawable.sb4)
            "Charamel Frapp"    -> binding.imgOrderedBeverage.setImageResource(R.drawable.sb5)
            "Black Forest Frapp"-> binding.imgOrderedBeverage.setImageResource(R.drawable.sb6)
        }

        binding.fabOrder.setOnClickListener {
            intentHelper.shareIntent(this, order.productName)
        }

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val sysBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(sysBars.left, sysBars.top, sysBars.right, sysBars.bottom)
            insets
        }
    }
}