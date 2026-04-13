package ch14

import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.milliseconds

suspend fun main() {
    delay(5000.milliseconds)
    println("Hello World!")
}