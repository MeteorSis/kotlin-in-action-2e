package ch12

fun sum(x: Int, y: Int) = x + y

fun main() {
    val kFunction = ::sum
    println(kFunction.invoke(1, 2) + kFunction(3, 4))
    println(kFunction.call(1, 4))
    println(kFunction.callBy(mapOf(kFunction.parameters[0] to 1, kFunction.parameters[1] to 2)))
    //kFunction(1)
}