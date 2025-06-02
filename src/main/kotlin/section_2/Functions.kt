package section_2

fun main() {
    sumOfTwoNumbers()
    val result2 = sumOfTwoNumbers(3, 7)
    println(result2)
    println(sumOfTwoNumbers2(b = 7, a = 3))
}


fun sumOfTwoNumbers() {
    println(2 + 2)
}

fun sumOfTwoNumbers(a: Int, b: Int): Int {
    return a + b
}

fun sumOfTwoNumbers2(a: Int, b: Int) = a + b