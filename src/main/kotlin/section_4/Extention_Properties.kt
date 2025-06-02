package section_4

fun main() {
//    val name = "Viktor"
//    println(name.longOrShort)
//    println(name.quoted)

    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers.getFirstOrNull)
}

val String.longOrShort: String
    get() = if (length > 10) "Long" else "Short"

val String.quoted get() = "\"$this\""

val <T> List<T>.getFirstOrNull: T?
    get() = if (isEmpty()) null else first()
