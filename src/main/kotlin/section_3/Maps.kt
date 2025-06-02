fun main() {
    val animals = mapOf(
        "Monkey" to "brown", "Tiger" to "orange", "Whale" to "blue"
    )

//    println(animals.get("Monkey"))
//    println(animals["Baboon"])

    val keys = animals.keys
    val values = animals.values

//    println(keys)
//    println(values)

//    for (entry in animals) {
//        println(entry.key)
//        println(entry.value)
//    }

//    for ((key, value) in animals) {
//        println(key)
//        println(value)
//    }

//    animals.forEach { (key, value) ->
//        println(key)
//        println(value)
//    }

//    println(animals.getOrDefault(key = "Monkey", defaultValue = "Black"))
//
//    println(animals["Baboon"])
//    println(animals.getOrDefault(key = "Baboon", defaultValue = "Grey"))

//    val filteredMap = animals.filter {
//        it.value.length > 4
//    }
//    println(filteredMap.values)

//    val animalList = listOf("Monkey", "Tiger", "Whale")
//    println(animalList.associateBy { it })

    val monkey = Animal(name = "Monkey", age = 2)
    val tiger = Animal(name = "Tiger", age = 4)
    val whale = Animal(name = "Whale", age = 6)

    val animalList = listOf(monkey, tiger, whale)

    val animalMap = animalList.associateBy({ it.name }, { it.age })

    println(animalList)
    println(animalMap)


}


class Animal(
    val name: String, val age: Int
)