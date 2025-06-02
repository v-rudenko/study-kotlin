package section_5

fun main() {
//    val first = listOf("a", "b", "c", "d")
//    val second = listOf(1, 2, 3, 4)
//    println(first.zip(second))

//    val ids = listOf(10, 11, 12)
//    val names = listOf("Bob", "Jill", "Jim")
//    val result = ids.zip(names) { id, name ->
//        Person(id = id, name = name)
//    }
//    println(result)
//
//    println(result)

//    val  numbersMap = mapOf(1 to "One", 2 to "Two", 3 to "Three", 4 to "Four")
//    println(numbersMap.toList())
//    val (numbers, text) =  numbersMap.toList().unzip()
//    println(numbers)
//    println(text)

    ///////////////////////////

    val idList: List<String> = arrayListOf("id1", "id2", "id3", "id4", "id5", "id6")

    println(idList.chunked(2))


    idList.chunked(2).flatMap {ids ->
        println("SELECT * FROM TICKET WHERE TABLE.ID IN $ids")

        ids
    }






    //////////////////////////

    val list = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9),
    )

}

data class Person(
    val id: Int,
    val name: String
)