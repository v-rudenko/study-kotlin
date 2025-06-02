package hometasks

fun main() {
    val localDoctor: Job = Doctor()
    localDoctor.name = "Family doctor"
    localDoctor.salary = 6000
    localDoctor.work()
    localDoctor.study()
    localDoctor.work()


    val softwareEngineer: Job = Engineer()
    softwareEngineer.name = "Java developer"
    softwareEngineer.salary = 40_000
    softwareEngineer.work()
    softwareEngineer.study()
    softwareEngineer.work()

}

open class Job {
    var name: String = ""
    var revenue: Int = 0
    var salary: Int = 0

    fun work() {
        revenue += salary
        println("$name is working, revenue: $revenue")
    }

    open fun study() {
        salary += 200
        println("$name is studing, salary: $salary")
    }

}

class Doctor: Job()

class Engineer: Job() {
    override fun study() {
        salary += 1000
    }
}
