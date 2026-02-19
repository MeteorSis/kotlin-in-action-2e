package ch01

fun main() {
    val s: String? = null
    val s2: String = ""

    //println(s.length) // compile error
    println(s?.length)
    try {
    	println(s!!.length)
    } catch (e: NullPointerException) {
        println(e)
    }
	println(s2.length)
}
