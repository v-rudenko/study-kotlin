package org.example

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun main() {
    println("Program execution will now block")
    runBlocking {
        launch {
            delay(1000)
            println("Task from runBlocking")
        }
    }

    GlobalScope.launch {
        delay(500)
        println("Task from globalScope")

    }

    coroutineScope {
        launch {
            delay(1500)
            println("Task from coroutineScope")
        }
    }
    println("Program execution will now continue")
}