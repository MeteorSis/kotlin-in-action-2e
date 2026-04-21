package ch15

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield
import log.log

suspend fun doCpuHeavyWork(): Int {
    log("I'm doing work!")
    var counter = 0
    val startTime = System.currentTimeMillis()
    while (System.currentTimeMillis() < startTime + 500) {
        counter++
        yield()
    }

    return counter
}

fun main() {
    runBlocking {
        launch(CoroutineName("coroutine1")) {
            repeat(3) {
                doCpuHeavyWork()
            }
        }
        launch(CoroutineName("coroutine2")) {
            repeat(3) {
                doCpuHeavyWork()
            }
        }
    }
}