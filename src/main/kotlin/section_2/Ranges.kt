package org.example.section_2

fun main() {
//    val range1 = 1..10
//    val range2 = 0 until 10
//    showRange(range1)

    showRange(range = 1..3)
    showRange(range = 3 downTo 1)
    showRange(range = 0..10 step 2)
    showRange(range = 9 downTo 0 step 3)
}

fun showRange(range: IntProgression) {
    for (number in range) {
        print("Number is: $number, ")
    }
    print("// $range")
    println()
}