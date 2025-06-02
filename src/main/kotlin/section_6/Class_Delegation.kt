package section_6_delegation

fun main() {
    val freelancer = TypeScriptProgrammer()
    freelancer.work()
    freelancer.getPaid()

    val freelancer2 = PythonProgrammer(programmer = KotlinProgrammer(200))
    freelancer2.work()
    freelancer2.work()
    freelancer2.getPaid()

    val freelancer4 = Freelancer4()
}

interface Programmer {
    var working: Boolean
    fun work()
    fun getPaid()
}

interface Designer {
    var designing: Boolean
    fun design()
    fun getTheMoney()
}

class KotlinProgrammer(private val amount: Int) : Programmer {
    override var working = false

    override fun work() {
        println("Programming with Kotlin...")
        working = true
    }

    override fun getPaid() {
        if (working) {
            println("Getting pain for: $$amount")
        } else {
            println("No money! You need to work first.")
        }
        working = false
    }
}

class TypeScriptProgrammer : Programmer by KotlinProgrammer(100) {
    override fun work() {
        println("Programming with TypeScript")
        working = true
    }
}

class PythonProgrammer(programmer: Programmer) : Programmer by programmer {
    override fun work() {
        println("Programming with Python")
        working = true
    }
}

class GraphicDesigner(private val amount: Int) : Designer {
    override var designing = false

    override fun design() {
        println("Designing...")
        designing = true
    }

    override fun getTheMoney() {
        if (designing) {
            println("Getting pain for: $$amount")
        } else {
            println("No money! You need to work first.")
        }
        designing = false
    }
}


class Freelancer4 :
    Programmer by KotlinProgrammer(300),
    Designer by GraphicDesigner(350)