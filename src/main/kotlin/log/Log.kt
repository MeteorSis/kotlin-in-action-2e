package log

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.currentCoroutineContext

private var zeroTime = System.currentTimeMillis()
suspend fun log(message: Any?) =
    println(
        "${System.currentTimeMillis() - zeroTime} " +
                "[${currentCoroutineContext()[CoroutineName]?.name}] $message"
    )