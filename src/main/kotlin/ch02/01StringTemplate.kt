package ch02

fun main() {
    val name = "Kotlin"
    println("Hello, $name!")
    println("Hello, ${name.uppercase()}!")
    //println("Hello, $name님") // compile error
    println("Hello, ${name}님")
    println("Hello, ${if (name.isBlank()) "someone" else name}!")
}
