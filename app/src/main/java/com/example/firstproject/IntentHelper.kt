package com.example.firstproject

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class IntentHelper {

    fun openIntent(context: Context, order: String, activityToOpen: Class<*>) {
        val intent = Intent(context, activityToOpen).apply {
            putExtra("order", order)
            if (context !is AppCompatActivity) {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
        }
        context.startActivity(intent)
    }

    fun shareIntent(context: Context, order: Order) {
        val shareText = buildString {
            appendLine("Product: ${order.productName}")
            appendLine("Customer: ${order.customerName}")
            appendLine("Cell:    ${order.customerCell}")
            appendLine("Date:    ${order.orderDate}")
        }

        val sendIntent = Intent(Intent.ACTION_SEND).apply {
            putExtra(Intent.EXTRA_TEXT, shareText)
            type = "text/plain"
            if (context !is AppCompatActivity) {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
        }

        val chooser = Intent.createChooser(sendIntent, "Share order via").apply {
            if (context !is AppCompatActivity) {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
        }

        context.startActivity(chooser)
    }
}