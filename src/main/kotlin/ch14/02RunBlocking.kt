package ch14

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking {
    delay(5000.milliseconds)
    println("Hello World!")
    
}