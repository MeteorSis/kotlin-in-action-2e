package ch02

fun main() {
    for (x in 1..10) {
        print(x)
        print(", ")
    }

    println()

    for (x in 1..<10) {
        print(x)
        print(", ")
    }

    println()

    for (x in 10 downTo 1 step 2) {
        print(x)
        print(", ")
    }

    /*for (x in "Java".."Scala") { // compile error
        print(x)
        print(", ")
    }*/
}