package org.example.section_3

fun main() {
    val person = Person(name = "Viktor")

}

public class Person(private val name: String) {
    private val nickname = "Pongo_ow"
    fun getTheName() {
        println("Public: $name")
    }

    private fun getTheNickname() {
        println("Public: $nickname")
    }
}