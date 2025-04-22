<?php
// This is a comment in PHP

// Variables and Data Types
$integerVar = 42;
$floatVar = 3.14;
$stringVar = "Hello, World!";
$booleanVar = true;

// Data Structures
// Array
$myArray = [1, 2, 3, 4, 5];

// Associative Array (Dictionary)
$myDict = [
    "name" => "John",
    "age" => 30,
    "city" => "New York"
];

// Operators
// Arithmetic
$result = 10 + 5;  // Addition

// Comparison
$isEqual = 5 == 5;

// Logical
$logicalAnd = true && true;

// Control Structures
// If-else
function checkNumber(int $num): void {
    if ($num > 0) {
        echo "Positive number\n";
    } else {
        echo "Non-positive number\n";
    }
}

// For loop
function printNumbers(): void {
    for ($i = 0; $i < 5; $i++) {
        echo $i . "\n";
    }
}

// While loop
function countDown(): void {
    $count = 5;
    while ($count > 0) {
        echo $count . "\n";
        $count--;
    }
}

// Function definition and call
function greet(string $name): string {
    return "Hello, " . $name . "!";
}

// Input and Output
function main(): void {
    global $integerVar, $floatVar, $stringVar, $booleanVar, $myArray, $myDict;
    
    // Input
    echo "Enter your name: ";
    $userName = trim(fgets(STDIN));
    
    // Output
    echo "Basic variable examples:\n";
    echo "Integer: " . $integerVar . "\n";
    echo "Float: " . $floatVar . "\n";
    echo "String: " . $stringVar . "\n";
    echo "Boolean: " . ($booleanVar ? "true" : "false") . "\n";
    
    echo "\nArray example:\n";
    print_r($myArray);
    
    echo "\nDictionary example:\n";
    foreach ($myDict as $key => $value) {
        echo "$key: $value\n";
    }
    
    echo "\nFunction call example:\n";
    echo greet($userName) . "\n";
}

// Run the main function
main();
?> 