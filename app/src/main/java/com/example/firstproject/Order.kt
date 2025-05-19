package com.example.firstproject

class Order() {
     var productName: String = ""
     var customerName: String = ""
     var customerCell: String = ""
     var orderDate: String = ""

    constructor(pName: String) : this() {
        productName = pName
    }

    constructor(pName: String, cName: String, cCell: String, oDate: String) : this(pName) {
        customerName = cName
        customerCell = cCell
        orderDate = oDate
    }
}