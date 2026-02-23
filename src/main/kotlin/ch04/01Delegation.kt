package ch04

class CountingSet<T> : HashSet<T>() {
    var objectsAdded = 0
        private set

    override fun add(element: T): Boolean {
        objectsAdded++
        return super.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return super.addAll(elements)
    }
}

class CountingSetByDelegation<T>(
    private val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet {
    var objectsAdded = 0
        private set

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }
}

fun main() {
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("CountingSet: Added ${cset.objectsAdded} objects, ${cset.size} uniques.")
    // CountingSet: Added 6 objects, 2 uniques.

    val csetByDelegation = CountingSetByDelegation<Int>()
    csetByDelegation.addAll(listOf(1, 1, 2))
    println("CountingSetByDelegation: Added ${csetByDelegation.objectsAdded} objects, ${csetByDelegation.size} uniques.")
    // CountingSetByDelegation: Added 3 objects, 2 uniques.
}
