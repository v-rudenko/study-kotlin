package section_5

fun main() {
    val list = listOf(1, 10, 100, 1000)
    val result = list.fold(initial = 0) {sum, number ->
        println("Initial: $sum, Number: $number")
        sum + number
    }
    println(result)
}