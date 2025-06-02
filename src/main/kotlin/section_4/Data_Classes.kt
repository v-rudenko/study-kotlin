package section_4_data_classes

fun main() {
//    val person = Person(name = "Viktor", age = 25)
//    val person2 = person.copy(age = 30)
//    println(person)
//    println(person2)
//    println(person == person2)

    val person = Person(name = "Viktor", age = 25)
//    val person2 = Person(name = "Viktor")

//    println(person == person2)
//    println(person.age)

    val (name, age) = person
    println(name)
    println(age)










}

data class Person(
    val name: String,
    val age: Int
)

//data class Person(
//    val name: String
//) {
//    var age: Int = 0
//}
//class Person(
//    val name: String,
//    val age: Int
//)

data class User (
    val name: String,
    val email: String,
    val password: String
)

object UserObject {

}


///////////////////////////////////////

