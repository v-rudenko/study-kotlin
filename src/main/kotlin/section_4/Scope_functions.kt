package section_4_Scope

fun main() {
//    val name: String? = "John"
//    val length = name?.let {
//        println("Name is not null.")
//        it.length
//    } ?: 0
//    println("Length: $length")

    val person = Person(name = "John", age = 30)

    val result = person.run {
        age += 35
        "Name: $name - Age: $age"
    }
    person.age -= 35
    println(result)
}

data class Person(var name: String, var age: Int)