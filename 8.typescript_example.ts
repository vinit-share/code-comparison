// This is a comment in TypeScript

// Variables and Data Types
export const integerVar: number = 42;
export const floatVar: number = 3.14;
export const stringVar: string = "Hello, TypeScript!";
export const booleanVar: boolean = true;

// Data Structures
// Array
const tsArray: number[] = [1, 2, 3, 4, 5];

// Object (Dictionary)
const tsDict: { [key: string]: string } = {
    "name": "John",
    "age": "30",
    "city": "New York"
};

// Operators
// Arithmetic
const tsResult: number = 10 + 5;  // Addition

// Comparison
const tsIsEqual: boolean = 5 === 5;

// Logical
const tsLogicalAnd: boolean = true && true;

// Control Structures
// If-else
function tsCheckNumber(num: number): void {
    if (num > 0) {
        console.log("Positive number");
    } else {
        console.log("Non-positive number");
    }
}

// For loop
function tsPrintNumbers(): void {
    for (let i = 0; i < 5; i++) {
        console.log(i);
    }
}

// While loop
function tsCountDown(): void {
    let count = 5;
    while (count > 0) {
        console.log(count);
        count--;
    }
}

// Function definition and call
function tsGreet(name: string): string {
    return `Hello, ${name}!`;
}

// Input and Output
async function tsMain(): Promise<void> {
    // Input (in browser environment)
    const userName: string = prompt("Enter your name:") || "";

    // Output
    console.log("Basic variable examples:");
    console.log(`Integer: ${integerVar}`);
    console.log(`Float: ${floatVar}`);
    console.log(`String: ${stringVar}`);
    console.log(`Boolean: ${booleanVar}`);

    console.log("\nArray example:");
    console.log(tsArray);

    console.log("\nObject example:");
    for (const [key, value] of Object.entries(tsDict)) {
        console.log(`${key}: ${value}`);
    }

    console.log("\nFunction call example:");
    console.log(tsGreet(userName));
}

// Run the main function
tsMain().catch(console.error); 