package old_course.Coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

var functionCalls = 0

fun main() {
    print("Hello, ")


        runBlocking { competeMessage() }
        runBlocking { improveMessage() }


//    Thread.sleep(7000)
    println("There have been $functionCalls calls so far")

}

suspend fun competeMessage() {
    delay(2000)
    println("World!")
    functionCalls++
}

suspend fun improveMessage() {
    delay(4000)
    println("Suspend functions are cool")
    functionCalls++
}