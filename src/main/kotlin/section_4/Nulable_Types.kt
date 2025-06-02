package section_4_null_tyoes

fun main() {
    val map = mapOf(1 to "One")
    val result = map[2]
    println(result)

    val regularString = "abc"
    val text: String? = null

    val nullableString: String? = null

    val text2: String? = regularString

    if (nullableString != null) {
        println(nullableString.length)
    }

    val person = Person(name = "Viktor", age = 25)
    val nullablePerson: Person? = null

    val number: Double? = null
}

data class Person(
    val name: String,
    val age: Int
)