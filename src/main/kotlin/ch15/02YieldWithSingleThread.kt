package ch15

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    val singleThreadDispatcher = Dispatchers.Default.limitedParallelism(1)
    runBlocking(singleThreadDispatcher) {
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