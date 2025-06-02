package section_4_data_classes_practice

fun main() {
    val customers = mutableListOf<Customer>()
    customers.add(Customer("Alice", "alice@example.com", 7))
    customers.add(Customer("Bob", "bob@example.com", 3))
    customers.add(Customer("Carol", "carol@example.com", 8))
    println(customers)

    val newCustomer = customers[1].copy(email = "bobun@example.com")
    println(newCustomer)

    sendEmail(customers)
}

fun sendEmail(customers: MutableList<Customer>) {
    customers.forEach { println("Sending an email to ${it.email}") }
}

data class Customer(
    val name: String,
    val email: String,
    val productsBought: Int
)