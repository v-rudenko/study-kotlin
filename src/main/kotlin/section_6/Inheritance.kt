package section_6_iheritance

fun main() {
    val myDoggy = Corgi()
    myDoggy.bark()
    myDoggy.play()
}

open class Dog {
    var size = 0

    fun  bark() = println("Bark")
    fun  play() = println("Play")
}

class Corgi: Dog() {

}