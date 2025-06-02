package org.example

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@OptIn(DelicateCoroutinesApi::class)
fun main() {
    GlobalScope.launch {
        delay(5000)
        println("World!")

    }
    print("Hello, ")
    Thread.sleep(6000)
}