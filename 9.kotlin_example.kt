// This is a comment in Kotlin

// Variables and Data Types
val integerVar: Int = 42
val floatVar: Float = 3.14f
val stringVar: String = "Hello, World!"
val booleanVar: Boolean = true

// Data Structures
// List (Array)
val myList: List<Int> = listOf(1, 2, 3, 4, 5)

// Map (Dictionary)
val myMap: Map<String, String> = mapOf(
    "name" to "John",
    "age" to "30",
    "city" to "New York"
)

// Operators
// Arithmetic
val result = 10 + 5  // Addition

// Comparison
val isEqual = 5 == 5

// Logical
val logicalAnd = true && true

// Control Structures
// If-else
fun checkNumber(num: Int) {
    if (num > 0) {
        println("Positive number")
    } else {
        println("Non-positive number")
    }
}

// For loop
fun printNumbers() {
    for (i in 0..4) {
        println(i)
    }
}

// While loop
fun countDown() {
    var count = 5
    while (count > 0) {
        println(count)
        count--
    }
}

// Function definition and call
fun greet(name: String): String {
    return "Hello, $name!"
}

// Input and Output
fun main() {
    // Input
    print("Enter your name: ")
    val userName = readLine() ?: ""
    
    // Output
    println("Basic variable examples:")
    println("Integer: $integerVar")
    println("Float: $floatVar")
    println("String: $stringVar")
    println("Boolean: $booleanVar")
    
    println("\nList example:")
    println(myList)
    
    println("\nMap example:")
    myMap.forEach { (key, value) ->
        println("$key: $value")
    }
    
    println("\nFunction call example:")
    println(greet(userName))
} 