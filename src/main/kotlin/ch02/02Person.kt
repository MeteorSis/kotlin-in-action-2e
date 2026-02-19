package ch02

class KtPerson(
    val name: String,
    var isStudent: Boolean,
    var hasCar: Boolean,
)

fun main() {
    val person = JavaPerson("Craig", true, true, true)
    println("Name: ${person.name}, isStudent: ${person.isStudent}, isTeacher: ${person.isTeacher}, hasCar: ${person.hasCar}")
    person.isStudent = false
    person.isTeacher = false
    person.hasCar = false
    println("Name: ${person.name}, isStudent: ${person.isStudent}, isTeacher: ${person.isTeacher}, hasCar: ${person.hasCar}")
}