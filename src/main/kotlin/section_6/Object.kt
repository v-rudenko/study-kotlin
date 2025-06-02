package section_6

import other.increment2

fun main() {
    Singleton.printName()
    increment()
    increment2()
    println(Counter.currentCount())




    val title = object {
        val eng = "English title"
        val ukr = "Українська назва"
    }

//    println(title)
    println(title.eng)
    println(title.ukr)

}

object Singleton {
    fun printName() {
        println("Hi, my name is Bob")
    }
}

object Counter {
    private var count = 0
    fun currentCount() = count
    fun increment() = count++
}

fun increment() {
    Counter.increment()
}

