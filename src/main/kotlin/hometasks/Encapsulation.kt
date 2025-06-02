package hometasks

fun main() {
    val kfc = Franchise()
    println(kfc.makeBurger())
}

open class KFC {
    private val formula =
        "Salt, Thyme, Basil, Oregano, Celery salt, Black pepper, Dried mustard, Paprika, Garlic salt, Ground ginger, White pepper"

    protected fun makeBurger(formula: String): String {
        if (formula == this.formula) {
            return "Burger"
        } else {
            return "Fail"
        }

    }

    protected fun getFormula(): String {
        return formula
    }
}

class Franchise : KFC() {
    fun makeBurger(): String {
        return super.makeBurger(getFormula())
    }
}