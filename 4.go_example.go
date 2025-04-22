// This is a comment in Go

package main

import (
	"fmt"
	"bufio"
	"os"
)

// Function declarations
func checkNumber(num int) {
	if num > 0 {
		fmt.Println("Positive number")
	} else {
		fmt.Println("Non-positive number")
	}
}

func printNumbers() {
	for i := 0; i < 5; i++ {
		fmt.Println(i)
	}
}

func countDown() {
	count := 5
	for count > 0 {
		fmt.Println(count)
		count--
	}
}

func greet(name string) string {
	return fmt.Sprintf("Hello, %s!", name)
}

func main() {
	// Variables and Data Types
	var integerVar int = 42
	var floatVar float64 = 3.14
	var stringVar string = "Hello, World!"
	var booleanVar bool = true

	// Data Structures
	// Slice (Array)
	var mySlice []int = []int{1, 2, 3, 4, 5}

	// Map (Dictionary)
	var myMap map[string]string = map[string]string{
		"name": "John",
		"age":  "30",
		"city": "New York",
	}

	// Operators
	// Arithmetic
	result := 10 + 5  // Addition

	// Comparison
	isEqual := 5 == 5

	// Logical
	logicalAnd := true && true

	// Input and Output
	reader := bufio.NewReader(os.Stdin)
	fmt.Print("Enter your name: ")
	userName, _ := reader.ReadString('\n')
	userName = userName[:len(userName)-1] // Remove newline

	// Output
	fmt.Println("Basic variable examples:")
	fmt.Printf("Integer: %d\n", integerVar)
	fmt.Printf("Float: %f\n", floatVar)
	fmt.Printf("String: %s\n", stringVar)
	fmt.Printf("Boolean: %t\n", booleanVar)

	fmt.Println("\nSlice example:")
	fmt.Println(mySlice)

	fmt.Println("\nMap example:")
	for key, value := range myMap {
		fmt.Printf("%s: %s\n", key, value)
	}

	fmt.Println("\nFunction call example:")
	fmt.Println(greet(userName))
} 