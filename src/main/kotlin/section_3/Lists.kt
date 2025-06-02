package section_3

import kotlin.random.Random

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers.first())
    println(numbers.last())
    println(numbers.take(n = 3))
    println(Random.nextInt())
}