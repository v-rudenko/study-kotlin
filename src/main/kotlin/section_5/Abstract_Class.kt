package section_5_abstract

fun main() {
    val myDog = Dog()
    myDog.speak()
}

abstract class Animal {
    abstract val name: String
    protected var energy = 0

    abstract fun eat()
    open fun speak() = println("Wof!")
}

//interface Animal {
//    val name: String
//
//    fun speak() = println("Wof!")
//}

class Dog() : Animal() {
    override val name = "Patron"
    override fun speak() {
        println("Wof, Wof!")
    }

    override fun eat() {
        energy++
    }
}
