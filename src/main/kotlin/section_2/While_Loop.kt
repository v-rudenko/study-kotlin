package section_2

fun main() {
    var number = 0
    while (condition(number)) {
        println(number)
        number++
    }
}

//fun condition(number: Int): Boolean {
//    return number < 10
//}

fun condition(number: Int) = number < 10

