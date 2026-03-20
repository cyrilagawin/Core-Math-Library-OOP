# Lab Report: Core Math Library Using OOP Principles

**Course:** [Insert Course Name Here]  
**Student:** [Insert Your Name Here]  

## 1. Objective
The objective of this activity was to design and implement a reusable Core Math Library by applying Object-Oriented Programming (OOP) concepts, moving away from procedural logic and instead organizing mathematical operations into related, encapsulated classes.

## 2. Class Responsibilities
* **`MathOperation` (Abstract Base Class):** Acts as the foundation. Responsible for storing the common data (operands) required for mathematical calculations and protecting that data. It forces a contract via the abstract `calculate()` method.
* **`Addition` & `Division`:** Responsible for implementing specific arithmetic algorithms. They inherit from the base class and handle specific edge cases (e.g., division by zero).
* **`Circle`:** Responsible for geometric formulas. It maps the base class's primary operand to act as a "radius" and provides specialized methods like `getArea()`.
* **`NumberAnalyzer`:** Responsible for analyzing the properties of single integers, providing methods for checking primes, calculating factorials, and determining even/odd status.

## 3. Inheritance Structure
The library utilizes a hierarchical inheritance model to maximize code reuse:
* `MathOperation` (Base Class)
  * `Addition` (Derived)
  * `Division` (Derived)
  * `Circle` (Derived)
  * `NumberAnalyzer` (Derived)

Inheritance is appropriate here because every specific mathematical operation "is a" mathematical operation. They all share the need for numerical inputs and a calculation trigger, preventing redundant code.

## 4. Application of Encapsulation
In the `MathOperation` base class, `operand1` and `operand2` are declared as `private`. Direct access to these attributes from the main program is blocked. Data modification and retrieval are strictly controlled through public getter and setter methods (e.g., `setOperand1()`). This ensures objects maintain data integrity and internal state protection.

## 5. Extensibility Scenario
The design supports the Open-Closed Principle. If new operations like **Trigonometry** or **Statistics** are needed in the future, we simply create new classes that `extend MathOperation`. 
Because of encapsulation and inheritance, we can plug in this new functionality without modifying or breaking any existing code in the arithmetic or geometry modules.

## 6. Sample Terminal Output
```text
========== CORE MATH LIBRARY TEST SUITE ==========

--- Test Case 2.1: Addition Operation ---
Input: 15 + 10
Expected Output: 25.0
Actual Output: 25.0

--- Test Case 1.2: Controlled Data Update ---
Updated Operand 1 to 50 via setter.
New Output (50 + 10): 60.0

--- Test Case 2.2: Division by Zero ---
Error: Division by zero is undefined.
Output: Returned value: NaN

--- Test Case 3.1: Circle Area Calculation ---
Input: Radius = 5
Expected Output: ~78.54
Actual Output: 78.53981633974483

Error: Radius cannot be negative.
--- Test Case 3.2: Invalid Shape Dimension ---
Output: 

--- Test Case 4.1: Prime Number Check ---
Input: 7
Is Prime? true

--- Test Case 4.2: Non-Prime Number Check ---
Input: 10
Is Prime? false

--- Test Case 4.3: Factorial Computation ---
Input: 5
Factorial: 120

--- Test Case 7.1: Multiple Object Interaction ---
Circle 1 Area: 314.1592653589793
Number Analyzer Factorial: 120
Status: Objects maintain independent states successfully.
