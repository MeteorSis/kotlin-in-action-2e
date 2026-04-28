package ch18

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.supervisorScope

fun main(): Unit = runBlocking {
    supervisorScope {
        val myDeferredInt: Deferred<Int> = async {
            throw UnsupportedOperationException("Ouch!")
        }
        try {
            val i: Int = myDeferredInt.await()
            println(i)
        } catch (u: UnsupportedOperationException) {
            println("Handled: $u")
        }
    }
}