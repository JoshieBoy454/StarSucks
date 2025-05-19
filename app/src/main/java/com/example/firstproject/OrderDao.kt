package com.example.firstproject
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface OrderDao {
    @Insert
    fun insert(orderEntity: OrderEntity):Long

    @Query("SELECT * FROM orders")
    fun getAllOrders(): List<OrderEntity>
}