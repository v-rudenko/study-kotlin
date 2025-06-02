//package section_3

fun main() {
    val person = Person()
    println(person.age)
    println(person.addAge(newAge = 15))
    println(person.age)
}

//class Person {
//    var age = 0
//        get() {
//            return field
//        }
//        set(value) {
//            field = value
//        }
//}


//class Person {
//    private var accesses = 0
//    var age: Int = 0
//        get() = ++accesses
////        set(value) {
////            field = value
////        }
//}


//class Person(val age: Int) {
//    val isMinor
//        get() = age < 18
//}

class Person() {
    var age = 0
        private set

    fun addAge(newAge: Int) {
        age = newAge
    }
}