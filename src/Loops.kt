fun main() {
    val items1 = listOf("apple", "banana", "orange") // List.of() Java 9
    val items2 = mutableListOf("apple", "banana", "orange") // ArrayList

    // for each
    for (item in items1)
        println(item)

    // while
    var index = 0
    while (index < items1.size) {
        println("Item at $index is ${items1[index]}")
        index++
    }

    // range
    println(5 in 3..10)

    for (i in 1..3)
        println(i)

    // same
    for (i in 1 until 3)
        println(i)

    for (i in 10 downTo 7)
        println(i)

    for (i in 0..100 step 20)
        println(i)
}