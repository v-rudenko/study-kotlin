package extention_functions

fun main() {
    val name = "Viktor"
    println(name.h1())

    val person = Person(name = "Viktor", age = 25, address = "Ukraine, Kyiv!")
    println(person.info())
    println(person.addressInfo())
}

fun String.h1(): String {
    return "<h1>$this</h1>"
}

class Person (
    private val name: String,
    private val age: Int,
    val address: String

) {
    fun info() = "My name $name and I'm $age years old"
}

fun Person.addressInfo() = "Come visit me in $address"