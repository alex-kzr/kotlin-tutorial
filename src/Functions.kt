fun main() {
    println(testSimple1())
    println(testSimple2())
    println(testSimple3(2, 3))
    println(testString1(25))
    println(testNamedArguments(4,2,5))
    println(testNamedArguments(y = 4, x = 2, z = 5))
    testDefaultArguments()
    testDefaultArguments(2)
    testDefaultArguments(y = 3)
}

fun testSimple1(): Int {
    return 5 + 5
}

fun testSimple2(): Int = 3 + 3

fun testSimple3(x: Int, y: Int) = x + y

fun testString1(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

// void
fun testDefaultArguments(x: Int = 1, y: Int = 99) {
    println(x + y)
}

// overloading
fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false): String {
    return (if (toUpperCase) name.toUpperCase() else name) + number
}