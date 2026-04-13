package ch14

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main(): Unit = runBlocking {
    val deferred = async {
        delay(5000.milliseconds)
        print(coroutineContext)
        println(" Hello World!")
        123
    }
    val num = deferred.await()
    print(coroutineContext)
    print(" ")
    println(num)
}