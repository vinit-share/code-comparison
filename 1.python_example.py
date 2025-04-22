# This is a comment in Python
from typing import List, Dict, Union

# Variables and Data Types
integer_var: int = 42
float_var: float = 3.14
string_var: str = "Hello, World!"
boolean_var: bool = True

# Data Structures
# Array
my_list: List[int] = [1, 2, 3, 4, 5]

# Dictionary
my_dict: Dict[str, Union[str, int]] = {
    "name": "John",
    "age": 30,
    "city": "New York"
}

# Operators
# Arithmetic
result: int = 10 + 5  # Addition

# Comparison
is_equal: bool = 5 == 5

# Logical
logical_and: bool = True and True

# Control Structures
# If-else
def check_number(num: int) -> None:
    if num > 0:
        print("Positive number")
    else:
        print("Non-positive number")

# For loop
def print_numbers() -> None:
    for i in range(5):
        print(i)

# While loop
def count_down() -> None:
    count: int = 5
    while count > 0:
        print(count)
        count -= 1

# Function definition and call
def greet(name: str) -> str:
    return f"Hello, {name}!"

# Input and Output
def main() -> None:
    # Input
    user_name: str = input("Enter your name: ")
    
    # Output
    print("Basic variable examples:")
    print(f"Integer: {integer_var}")
    print(f"Float: {float_var}")
    print(f"String: {string_var}")
    print(f"Boolean: {boolean_var}")
    
    print("\nList example:")
    print(my_list)
    
    print("\nDictionary example:")
    print(my_dict)
    
    print("\nFunction call example:")
    print(greet(user_name))

if __name__ == "__main__":
    main() 