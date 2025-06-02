package hometasks

fun main() {
    val myOven = DefaultOven()
    myOven.cook()

    val hisOven = Bosch()
    hisOven.cook()

    val myRoaster = RoasterOven()
    myRoaster.roast()


}

abstract class Oven {
    open val cookingSpeed = "average"
    open val temperature = "average"
}

open class DefaultOven : Oven() {
    open fun cook() = println("cooking on $temperature temperature and with $cookingSpeed speed")
}

class Bosch: DefaultOven() {
    override val temperature = "higher"
}

class RoasterOven: Oven() {
    fun roast() = println("roasting on $temperature temperature and with $cookingSpeed speed")
}