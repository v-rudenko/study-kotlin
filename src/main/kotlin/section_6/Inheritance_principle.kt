package section_6

fun main() {
    val son = Son()
    son.getFullName()
}

open class Father {
    open var firstName = "Yurii"
    open val lastName = "Rudenko"

    open fun getFullName() = println("Full name is: $firstName $lastName")
}

class Son: Father() {
    override var firstName = "Viktor"

    override fun getFullName() {
        super.getFullName()
        println("Full name is: ${super.firstName} $lastName")
    }
}