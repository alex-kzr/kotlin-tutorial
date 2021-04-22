fun main() {
    val child = User("Child", "Child", 1)
    val user1 = User("Tom", "Jones", 35, child)
    println(user1.lastName)

    val rectangle1 = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle1.perimeter}")

    val rectangle2 = Rectangle(5.0, 2.0)
    println(rectangle1 == rectangle2) // true
}

// Primary Constructor
class User(val  firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<User> = mutableListOf() // ArrayList

    init {
        println("User $firstName is created")
    }

    // Secondary constructor
    constructor(firstName: String, lastName: String, age: Int, child: User):
            this(firstName, lastName, age) {
        children.add(child)
    }

    // Constructor without args
    constructor(): this("", "", -1)
}

data class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1 // this.test
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = height * length
}