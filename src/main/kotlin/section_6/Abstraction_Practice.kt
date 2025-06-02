package section_6_abs

fun main() {
    val myDog: Dog = Pug()
    myDog.play()
}


abstract class Dog() {
    abstract val canPlay: Boolean
    abstract val canRun: Boolean
    abstract val canBark: Boolean
    abstract val name: String

    fun run() = println("A $name ${if (canRun) "can" else "CANNOT"} run")

    fun bark() = println("A $name ${if (canBark) "can" else "CANNOT"} bark")

    fun play() = println("A $name ${if (canPlay) "can" else "CANNOT"} play")

}

class Pug : Dog() {
    override val canPlay: Boolean = true
    override val canRun: Boolean = true
    override val canBark: Boolean = false
    override val name = "Pug"
}

class BassetHound :Dog() {
    override val canPlay: Boolean = true
    override val canRun: Boolean = false
    override val canBark: Boolean = true
    override val name = "Basset Hound"
}

class OldChihuahua :Dog() {
    override val canPlay: Boolean = false
    override val canRun: Boolean = false
    override val canBark: Boolean = true
    override val name = "Old Chihuahua"
}

