package section_6_casting

fun main() {

}

interface Animal {
    fun eat()
    fun run()
}

class Dog : Animal {
    override fun eat() {
        println("${this::class.qualifiedName} is eating")
    }

    override fun run() {
        println("${this::class.qualifiedName} is running")
    }

}

class Cot : Animal {
    override fun eat() {
        println("${this::class.qualifiedName} is eating")
    }

    override fun run() {
        println("${this::class.qualifiedName} is running")
    }

}