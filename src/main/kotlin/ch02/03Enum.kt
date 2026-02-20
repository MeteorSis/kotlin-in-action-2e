package ch02

enum class Color(
    val r: Int,
    val g: Int,
    val b: Int,
) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);

    val rgb: Int get() = (r * 256 + g) * 256 + b
    fun printColor() = println("$this is $rgb")
}

fun main() {
    println(Color.BLUE.rgb)
    Color.GREEN.printColor()

    when (Color.BLUE) {
        Color.RED -> println("red")
        Color.GREEN -> println("green")
        Color.BLUE -> println("blue")
        //else -> println("Unknown")
    }
}