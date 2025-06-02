package hometasks

fun main() {
    val olympics = Olympics()
    println(olympics.checkMedal(1))
    println(olympics.checkMedal(2))
    println(olympics.checkMedal(3))
    println(olympics.checkMedal(4))
    println()
    println(olympics.checkPosition(Medal.BRONZE))
    println(olympics.checkPosition(Medal.SILVER))
    println(olympics.checkPosition(Medal.GOLD))
    println(olympics.checkPosition(Medal.NONE))

}

class Olympics {
    fun checkMedal(position: Int): Medal {
        return when (position) {
            1 -> Medal.GOLD
            2 -> Medal.SILVER
            3 -> Medal.BRONZE
            else -> Medal.NONE
        }
    }

    fun checkPosition(medal: Medal): Int? {
        if (medal == Medal.NONE) return null
        return medal.ordinal
    }
}


enum class Medal() {
    NONE, GOLD, SILVER, BRONZE,
}