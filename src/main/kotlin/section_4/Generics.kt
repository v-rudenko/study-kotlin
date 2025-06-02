package section_4_generics

fun main() {
//    val car = Car(tires = Tires(size = 17))
//    val car2 = Car(tires = "17")
//    val car3 = Car(tires = 17)
//    println(car.getValue())
//    println(car2.getValue())
//    println(car3.getValue())

    val vehicle = Vehicle(value = Car())
    val car = vehicle.getValue()
    car.start()

    println(car.start())


    println(getName(Vehicle(value = 1)))
}

class Vehicle<T>(private val value: T) {
    fun getValue(): T = value
}

class Car {
    fun start() = "Starting the engine."
}


fun <T> getName(name: T): T = name

//data class Tires(val size: Int)
//class Car(private val tires: Tires) {
//    fun getValue() = tires
//}


//data class Tires(val size: Int)
//class Car<T>(private val tires: T) {
//    fun getValue(): T = tires
//}