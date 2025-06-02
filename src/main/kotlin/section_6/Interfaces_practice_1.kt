package section_6

fun main() {
    val rest1 = LocalRestaurant()
    rest1.provideFood()
    rest1.provideBill()

    val rest2 = FancyRestaurant()
    rest2.provideFood()
    rest2.provideBill()
}

interface Restaurant {
    fun provideFood()
    fun provideBill()
}

class LocalRestaurant: Restaurant {
    override fun provideFood() {
        println("Food and drinks provided by a local restaurant")
    }

    override fun provideBill() {
        println("Please pay 25")
    }
}

class FancyRestaurant: Restaurant {
    override fun provideFood() {
        println("The most expensive food")
    }

    override fun provideBill() {
        println("Please pay 700")
    }
}