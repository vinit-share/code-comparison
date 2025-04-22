// This is a comment in C#

using System;
using System.Collections.Generic;

class CSharpExample
{
    // Variables and Data Types
    int integerVar = 42;
    float floatVar = 3.14f;
    string stringVar = "Hello, C#!";
    bool booleanVar = true;

    // Data Structures
    // Array
    static int[] myArray = { 1, 2, 3, 4, 5 };

    // Dictionary (Map)
    static Dictionary<string, string> myDict = new Dictionary<string, string>
    {
        { "name", "John" },
        { "age", "30" },
        { "city", "New York" }
    };

    // Operators
    // Arithmetic
    static int result = 10 + 5;  // Addition

    // Comparison
    static bool isEqual = 5 == 5;

    // Logical
    static bool logicalAnd = true && true;

    // Control Structures
    // If-else
    static void CheckNumber(int num)
    {
        if (num > 0)
        {
            Console.WriteLine("Positive number");
        }
        else
        {
            Console.WriteLine("Non-positive number");
        }
    }

    // For loop
    static void PrintNumbers()
    {
        for (int i = 0; i < 5; i++)
        {
            Console.WriteLine(i);
        }
    }

    // While loop
    static void CountDown()
    {
        int count = 5;
        while (count > 0)
        {
            Console.WriteLine(count);
            count--;
        }
    }

    // Function definition and call
    static string Greet(string name)
    {
        return $"Hello, {name}!";
    }

    // Input and Output
    static void Main(string[] args)
    {
        // Input
        Console.Write("Enter your name: ");
        string userName = Console.ReadLine();

        // Output
        Console.WriteLine("Basic variable examples:");
        Console.WriteLine($"Integer: {integerVar}");
        Console.WriteLine($"Float: {floatVar}");
        Console.WriteLine($"String: {stringVar}");
        Console.WriteLine($"Boolean: {booleanVar}");

        Console.WriteLine("\nArray example:");
        Console.WriteLine(string.Join(", ", myArray));

        Console.WriteLine("\nDictionary example:");
        foreach (var kvp in myDict)
        {
            Console.WriteLine($"{kvp.Key}: {kvp.Value}");
        }

        Console.WriteLine("\nFunction call example:");
        Console.WriteLine(Greet(userName));

        // Call the functions
        CheckNumber(5);
        PrintNumbers();
        CountDown();
    }
} 