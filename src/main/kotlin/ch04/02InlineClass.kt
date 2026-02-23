package ch04

@JvmInline
value class UsdCent(val amount: Int)

fun main() {
    val price = UsdCent(100)
    println(price)
}
