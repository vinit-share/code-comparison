// This is a comment in Swift

// Variables and Data Types
let integerVar: Int = 42
let floatVar: Float = 3.14
let stringVar: String = "Hello, World!"
let booleanVar: Bool = true

// Data Structures
// Array
let myArray: [Int] = [1, 2, 3, 4, 5]

// Dictionary
let myDict: [String: String] = [
    "name": "John",
    "age": "30",
    "city": "New York"
]

// Operators
// Arithmetic
let result = 10 + 5  // Addition

// Comparison
let isEqual = 5 == 5

// Logical
let logicalAnd = true && true

// Control Structures
// If-else
func checkNumber(_ num: Int) {
    if num > 0 {
        print("Positive number")
    } else {
        print("Non-positive number")
    }
}

// For loop
func printNumbers() {
    for i in 0..<5 {
        print(i)
    }
}

// While loop
func countDown() {
    var count = 5
    while count > 0 {
        print(count)
        count -= 1
    }
}

// Function definition and call
func greet(_ name: String) -> String {
    return "Hello, \(name)!"
}

// Input and Output
func main() {
    // Input
    print("Enter your name: ", terminator: "")
    let userName = readLine() ?? ""
    
    // Output
    print("Basic variable examples:")
    print("Integer: \(integerVar)")
    print("Float: \(floatVar)")
    print("String: \(stringVar)")
    print("Boolean: \(booleanVar)")
    
    print("\nArray example:")
    print(myArray)
    
    print("\nDictionary example:")
    for (key, value) in myDict {
        print("\(key): \(value)")
    }
    
    print("\nFunction call example:")
    print(greet(userName))
}

// Run the main function
main() 