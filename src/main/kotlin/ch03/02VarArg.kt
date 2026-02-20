package ch03

fun printAll(vararg messages: String) {
    for (m in messages) println(m)
    println()
    println(messages[0])
}

fun main() {
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")
    println()
    val array = arrayOf("Hello", "Hallo", "Salut", "Hola", "你好")
    printAll(*array) // spread operator
}