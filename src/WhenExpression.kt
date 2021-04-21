fun main() {
    testWhen(1)
    testWhen("Hello")
    testWhen(2)
    testWhen(3)
    testWhen(6.3)
}

// testWhen(Object object) in Java
fun testWhen(input: Any) {
    when (input) {
        1 -> println("One")
        2 -> println("Two")
        in 3..10 -> println("From 3 to 10")
        is String -> println("The entered string length ${input.length} chars")
        else -> print("Something else")
    }
}