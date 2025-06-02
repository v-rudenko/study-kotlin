package hometasks

fun main() {
    val articles = mutableListOf<Article>(
        Article("Baboons", content = "baboons text", 600),
        Article("Monkeys", content = "monkeys text", 200)
    )

    val displayArticles = mutableListOf<Article>()

    displayArticles.add(articles[0].copy(title = "Fat baboons", numberOfReaders = 0))
    displayArticles.add(articles[1].copy(title = "Fat monkeys", numberOfReaders = 0))

    println(articles)
    println()
    println(displayArticles)
}

data class Article (
    val title: String,
    val content: String,
    val numberOfReaders: Long
)