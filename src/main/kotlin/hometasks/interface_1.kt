package hometasks

fun main() {
    val coffeeShop = CoffeeShop()
    val coffee = coffeeShop.buyCoffe()
    coffee.drink()
}


enum class CoffeeTypes {
    Arabica, Robusta
}


interface Coffee {
    val type: CoffeeTypes
    fun drink()
}

class Arabica: Coffee {
    override val type = CoffeeTypes.Arabica
    override fun drink() {
        println("You drink cup of tasty $type coffee")
    }
}

class Robusta: Coffee {
    override val type = CoffeeTypes.Robusta

    override fun drink() {
        println("You drink cup of not good enough $type")
    }

}

class CoffeeShop {
    fun buyCoffe(): Coffee {
        return Robusta()
    }
}