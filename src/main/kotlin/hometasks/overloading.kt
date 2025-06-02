package hometasks

fun main() {
    addTax(title = "gun", price = 99.99f)
    addTax(
        mapOf(
            "Pig" to 100f,
            "Cow" to 200f,
            "Baboon" to 1000f
        )
    )
}

fun addTax(title: String, price: Float) {
    val priceWithTax = (kotlin.math.round((price * 1.2f) * 100) / 100)
    println("Product \"$title\" costs $priceWithTax")
}

fun addTax(products: Map<String, Float>) {
    products.forEach { (key, value) ->
        addTax(key, value)
    }
}

//fun addTax(title: String, price: Float): Item {
//    return Item (title = title, price = (kotlin.math.round((price + price * 0.2f) * 100) / 100)
//    )
//}
//
////class Item(title: String, price: Float) {
////    val title = title
////    val price = price
////}
//
//class Item(val title: String, val price: Float)
