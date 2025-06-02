package section_4_destructuring

fun main() {
//    val pair = Pair(first = 1, second = "Viktor")
//
//    val (id, name) = pair
//    println(id)
//    println(name)

    val person = Person(name = "Viktor", age = 25, address = "Kyiv, Ukraine")
    val (_, age) = person


    val map = mapOf(1 to "One")

    for ((number, text) in map) {
        println(number)
        println(text)
    }
}


data class Person(
    val name: String,
    val age: Int,
    val address: String
)