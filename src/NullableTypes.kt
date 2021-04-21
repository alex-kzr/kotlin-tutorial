fun main() {
    var a: String = "Hello"
    // a = null // null pointer exception

    var b: String? = "Test"
    b = null

    // b.length // null pointer exception

    b?.length // safe call without NPE

    println(b?.length)

    // Elvis operator
    val length = b?.length ?: -1
    println(length)
}