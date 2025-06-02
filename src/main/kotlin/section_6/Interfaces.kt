package section_6

fun main() {
    val dog = Dog()
    val cat = Cat(color = "white")

    val male = Male()
    male.eyeColor()

    val male2 = Person { "Yellow" }

    println(male2)
}

class Male : Person {
    override fun eyeColor() = "Black"

}

fun interface Person {
    fun eyeColor(): String
    fun heirColor(): String = "Brown"
}

open class Dog : Animal {
    override val legs: Int = 4
    override val color = "Black"
    override fun speak() = "Wof!"
}

class Cat(override val color: String) : Animal {
    override val legs: Int = 4
    override fun speak() = "Meow!"
}

interface Animal {
    val legs: Int

    //    val color: String
//        get() = "Black"
    val color: String

    fun speak(): String
    fun walk(): Int {
        var steps = 0
        for (step in 0..20 step 2) {
            steps += step
        }
        return steps
    }
}