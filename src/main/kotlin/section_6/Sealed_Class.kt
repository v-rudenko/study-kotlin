package section_6_sealed

fun main() {
//    val baboon = Animal()
}

sealed class Vehicle

data class Car (
    val manufacturer: String,
    val model: String
): Vehicle()


data class Bicycle (
    val manufacturer: String
): Vehicle()

data class Atv (
    val manufacturer: String
): Vehicle()

fun getVehicle(vehicle: Vehicle) =
    when(vehicle) {
        is Car -> "${vehicle.manufacturer} - ${vehicle.model}"
        is Bicycle -> vehicle.manufacturer
        is Atv -> TODO()
    }

sealed class Animal {
    abstract val IsMale: Boolean
    val legs: Int = 4
    abstract fun speak(): String
    fun eat() = "Eating"
}