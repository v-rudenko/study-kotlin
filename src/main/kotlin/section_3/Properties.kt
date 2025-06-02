package section_3

fun main() {
//    val person1 = Person()
//    println(person1.personeAge)
//    person1.setAge(age = 14)
//    println(person1.personeAge)
//
//    val person2 = Person()
//    println(person2.personeAge)
//    person2.setAge(age = 24)
//    println(person2.personeAge)

    val person1 = Person()
    val person2 = person1

    println(person1.personAge)
    println(person2.personAge)
    person1.setAge(30)
    println(person1.personAge)
    println(person2.personAge)
}

class Person {
    var personAge = 0

    fun setAge(age: Int) {
        personAge = age
    }
}