package ch12

import kotlin.reflect.full.createInstance
import kotlin.reflect.full.memberProperties

class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Alice", 29)
    val kClass = person::class
    kClass.createInstance()
    println(kClass.simpleName)
    kClass.memberProperties.forEach { println(it.name) }
}