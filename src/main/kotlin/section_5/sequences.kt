package section_5

fun main() {
    val list = listOf(1, 2, 3, 4)
    list.filter { it % 2 == 0 }.map { it * it }.any {it < 10}
}