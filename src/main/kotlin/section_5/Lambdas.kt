package section_5

fun main() {
    val numbers = listOf(1, 2, 3)
    val quotedNumbers = numbers.map { number ->
        "'$number'"
    }
    println(numbers)
    println(quotedNumbers)

    val quotedNumbers2 = numbers.joinToString { number ->
        "'$number'"
    }
    println(quotedNumbers2)
}


