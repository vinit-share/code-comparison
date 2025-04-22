// This is a comment in C++

#include <iostream>
#include <string>
#include <vector>
#include <map>

using namespace std;

// Function declarations
void checkNumber(int num);
void printNumbers();
void countDown();
string greet(string name);

int main() {
    // Variables and Data Types
    int integerVar = 42;
    float floatVar = 3.14f;
    string stringVar = "Hello, World!";
    bool booleanVar = true;

    // Data Structures
    // Vector (Array)
    vector<int> myVector = {1, 2, 3, 4, 5};

    // Map (Dictionary)
    map<string, string> myMap;
    myMap["name"] = "John";
    myMap["age"] = "30";
    myMap["city"] = "New York";

    // Operators
    // Arithmetic
    int result = 10 + 5;  // Addition

    // Comparison
    bool isEqual = 5 == 5;

    // Logical
    bool logicalAnd = true && true;

    // Input and Output
    string userName;
    cout << "Enter your name: ";
    getline(cin, userName);

    // Output
    cout << "Basic variable examples:" << endl;
    cout << "Integer: " << integerVar << endl;
    cout << "Float: " << floatVar << endl;
    cout << "String: " << stringVar << endl;
    cout << "Boolean: " << booleanVar << endl;

    cout << "\nVector example:" << endl;
    for (int num : myVector) {
        cout << num << " ";
    }
    cout << endl;

    cout << "\nMap example:" << endl;
    for (const auto& pair : myMap) {
        cout << pair.first << ": " << pair.second << endl;
    }

    cout << "\nFunction call example:" << endl;
    cout << greet(userName) << endl;

    return 0;
}

// Control Structures
// If-else
void checkNumber(int num) {
    if (num > 0) {
        cout << "Positive number" << endl;
    } else {
        cout << "Non-positive number" << endl;
    }
}

// For loop
void printNumbers() {
    for (int i = 0; i < 5; i++) {
        cout << i << endl;
    }
}

// While loop
void countDown() {
    int count = 5;
    while (count > 0) {
        cout << count << endl;
        count--;
    }
}

// Function definition and call
string greet(string name) {
    return "Hello, " + name + "!";
} 