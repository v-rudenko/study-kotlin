package section_5_member


fun main() {
    val people = listOf<Person>(
        Person("John", 20, true),
        Person("Harry", 22, male = true),
        Person("Hermione", 23, false),
        Person("Ana", age = 24, false),
        Person("Jennifer", age = 21, false),
    )
//    people.filter { person -> person.male }.forEach { println(it.name) }
//    println()
//    people.filter { person -> !person.male }.forEach { println(it.name) }

    val ana = Person("Ana", age = 24, false)
    println(ana::male)

    people.filter(Person::male).forEach { println(it.name) }
    people.filterNot(Person::male).forEach { println(it.name) }
}


data class Person(
    val name: String,
    val age: Int,
    val male: Boolean,
)