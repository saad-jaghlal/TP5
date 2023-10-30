// Opérateurs unaires
data class MyNumber(var value: Int)

operator fun MyNumber.unaryPlus() {
    value = +value
}

operator fun MyNumber.unaryMinus() {
    value = -value
}

// incrémentation et de décrémentation
operator fun MyNumber.inc(): MyNumber {
    return MyNumber(value + 1)
}

operator fun MyNumber.dec(): MyNumber {
    return MyNumber(value - 1)
}

// Opérateurs binaires
data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

operator fun Point.minus(other: Point): Point {
    return Point(x - other.x, y - other.y)
}

// Opérateurs de comparaison
data class Person(val name: String, val age: Int)

//fun Person.equals(other: Person): Boolean {
//    return this.name == other.name && this.age == other.age
//}

operator fun Person.compareTo(other: Person): Int {
    return this.age - other.age
}

fun main() {
    // Opérateurs unaires
    val num = MyNumber(5)
    +num
    println("Unary Plus: ${num.value}")
    -num
    println("Unary Minus: ${num.value}")

    // incrémentation et de décrémentation
    var counter = MyNumber(10)
    counter++
    println("Increment: ${counter.value}")
    counter--
    println("Decrement: ${counter.value}")

    // Opérateurs binaires
    val point1 = Point(3, 4)
    val point2 = Point(1, 2)
    val sum = point1 + point2
    val difference = point1 - point2
    println("Point Sum: (${sum.x}, ${sum.y})")
    println("Point Difference: (${difference.x}, ${difference.y})")

    // Opérateurs de comparaison
    val person1 = Person("Alice", 30)
    val person2 = Person("Bob", 25)
    val person3 = Person("Alice", 30)

    println("Comparison 1: ${person1 == person2}")
    println("Comparison 2: ${person1 == person3}")
//    println("Comparison 3: ${person1 > person2}")
}
