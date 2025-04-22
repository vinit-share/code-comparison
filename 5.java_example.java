// This is a comment in Java

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class java_example {
    public static void main(String[] args) {
        // Variables and Data Types
        int integerVar = 42;
        double floatVar = 3.14;
        String stringVar = "Hello, World!";
        boolean booleanVar = true;

        // Data Structures
        // List (Array)
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        // Map (Dictionary)
        Map<String, String> myMap = new HashMap<>();
        myMap.put("name", "John");
        myMap.put("age", "30");
        myMap.put("city", "New York");

        // Operators
        // Arithmetic
        int result = 10 + 5;  // Addition

        // Comparison
        boolean isEqual = 5 == 5;

        // Logical
        boolean logicalAnd = true && true;

        // Input and Output
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        // Output
        System.out.println("Basic variable examples:");
        System.out.println("Integer: " + integerVar);
        System.out.println("Float: " + floatVar);
        System.out.println("String: " + stringVar);
        System.out.println("Boolean: " + booleanVar);

        System.out.println("\nList example:");
        System.out.println(myList);

        System.out.println("\nMap example:");
        System.out.println(myMap);

        System.out.println("\nFunction call example:");
        System.out.println(greet(userName));

        scanner.close();
    }

    // Control Structures
    // If-else
    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Non-positive number");
        }
    }

    // For loop
    public static void printNumbers() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    // While loop
    public static void countDown() {
        int count = 5;
        while (count > 0) {
            System.out.println(count);
            count--;
        }
    }

    // Function definition and call
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
} 