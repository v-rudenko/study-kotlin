fun main() {
    val mySet = setOf(1, 2, 2, 3, 3, 4, 6, 4)
    val mySet2 = mutableSetOf(1, 2, 2, 3, 3, 4, 6, 4)
    val myList = listOf(1, 2, 2, 3, 3, 4, 6, 4)
//    println(mySet)
//    println(mySet.contains(element = 2))
//    println(2 in mySet)
//    println(mySet.containsAll(elements = setOf(1, 3, 5)))

    println(mySet)
    println(mySet subtract setOf(6, 11))
    println(mySet intersect setOf(6, 11))
    println(mySet union setOf(6, 11))
    println()
    println(myList)
    println(myList.distinct())  //remove duplicate
//    println(myList.subtract(listOf(2, 3)))
}