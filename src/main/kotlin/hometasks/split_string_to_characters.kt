package hometasks

/**
 * Create function which will accept a string parameter. User while loop to print each character
 */

fun main() {
    print("Input string: ")
    val text = readln()
//    printIndividualCharacter(text)
    printIndividualCharacterNew(text)
}

fun printIndividualCharacter(word: String) {
    var counter = 0
    while (counter < word.length) {
        print("${word[counter]}${if (counter + 1 < word.length) " " else ""}")
        counter++
    }
}

fun printIndividualCharacterNew(word: String) {
    for (letter in word) {
        print(letter)
    }
}
