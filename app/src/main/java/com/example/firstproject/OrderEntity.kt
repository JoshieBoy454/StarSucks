package com.example.firstproject

data class OrderEntity(
    var productName: String,
    var customerName: String,
    var customerCell: String,
    var orderDate: String
)
private fun saveOrderToDatabase(order: Order) {
    val orderEntity = OrderEntity(
        productName = order.productName,
        customerName = order.customerName,
        customerCell = order.customerCell,
        orderDate = order.orderDate
    )
    val appDatabase = AppDatabase.getDatabase(context)
    val orderDao = appDatabase.orderDao()
    orderDao.insert(orderEntity)
}
