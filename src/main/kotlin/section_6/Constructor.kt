package section_6_constructor

fun main() {
    val car1 = Car()
    val car2 = Car("Audi")
    val car3 = Car("Ford", 270)
    val myCar = Car("BMW", 260)

    car1.displayValues()
    car2.displayValues()
    car3.displayValues()
    myCar.displayValues()

}

//class Car(var model: String, val topSpeed: Int) {
//
//}

class Car {
    constructor() {
        model = "No model"
        topSpeed = 150
    }

    constructor(newModel: String) {
        model = newModel
        topSpeed = 150
    }

    constructor(newModel: String, newTopSpeed: Int) {
        model = newModel
        topSpeed = newTopSpeed
    }

    var model: String
    var topSpeed = 100

    fun displayValues() {
        println("$model have speed $topSpeed")
    }

}