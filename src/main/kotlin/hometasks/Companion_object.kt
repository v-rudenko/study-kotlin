package hometasks

fun main() {
    val myBook = Book(Title(eng = "Eng title", ukr = "Ukr title"))
    println(Book.Editor.name)
    println(myBook.editor.name)
}

class Book(
    var title: Title
) {
    val editor = Editor

    companion object Editor {
        var name = "Viktor"
    }
}

class Title(
    var eng: String,
    var ukr: String
)