// This is a comment in JavaScript

// Variables and Data Types
let integerVar = 42;
let floatVar = 3.14;
let stringVar = "Hello, World!";
let booleanVar = true;

// Data Structures
// Array
let myArray = [1, 2, 3, 4, 5];

// Object (Dictionary/Map)
let myObject = {
    name: "John",
    age: 30,
    city: "New York"
};

// Operators
// Arithmetic
let result = 10 + 5;  // Addition

// Comparison
let isEqual = 5 === 5;

// Logical
let logicalAnd = true && true;

// Control Structures
// If-else
function checkNumber(num) {
    if (num > 0) {
        console.log("Positive number");
    } else {
        console.log("Non-positive number");
    }
}

// For loop
function printNumbers() {
    for (let i = 0; i < 5; i++) {
        console.log(i);
    }
}

// While loop
function countDown() {
    let count = 5;
    while (count > 0) {
        console.log(count);
        count--;
    }
}

// Function definition and call
function greet(name) {
    return `Hello, ${name}!`;
}

// Input and Output
function main() {
    // Input (in browser environment)
    let userName = prompt("Enter your name: ");
    
    // Output
    console.log("Basic variable examples:");
    console.log(`Integer: ${integerVar}`);
    console.log(`Float: ${floatVar}`);
    console.log(`String: ${stringVar}`);
    console.log(`Boolean: ${booleanVar}`);
    
    console.log("\nArray example:");
    console.log(myArray);
    
    console.log("\nObject example:");
    console.log(myObject);
    
    console.log("\nFunction call example:");
    console.log(greet(userName));
}

// Run the main function
main(); 