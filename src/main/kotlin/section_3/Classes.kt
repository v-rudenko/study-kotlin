package org.example.section_3//package org.example.section_3

fun main() {
    val house = House()
    val house2 = House()
    println(house.enterTheHouse())
    println(house2)
}

class House {
    fun enterTheHouse() = "Entering the house..."
}