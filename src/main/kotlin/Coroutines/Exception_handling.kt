package old_course.Coroutines

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.coroutineContext

suspend fun main() {
    runBlocking {
        val myHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
            println("Exception handled: ${throwable.localizedMessage}")
        }
        val job = GlobalScope.launch(myHandler) {
            println("Throwing exception from job")
            throw IndexOutOfBoundsException("Exception in coroutine")
        }
        job.join()
    }

    val deferred = GlobalScope.async {
        println("Throwing exception from async")
        throw ArithmeticException("Exception from async")
    }
    try {
        deferred.await()
    } catch (e: ArithmeticException) {
        println("Caught ArithmeticException: ${e.localizedMessage}")
    }
}