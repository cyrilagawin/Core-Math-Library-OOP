public class CoreMathDemo {
    public static void main(String[] args) {
        System.out.println("========== CORE MATH LIBRARY TEST SUITE ==========\n");

        // Test Case Group 1 & 2: Encapsulation & Arithmetic Operations
        System.out.println("--- Test Case 2.1: Addition Operation ---");
        Addition add = new Addition(15, 10);
        System.out.println("Input: 15 + 10");
        System.out.println("Expected Output: 25.0");
        System.out.println("Actual Output: " + add.calculate() + "\n");

        System.out.println("--- Test Case 1.2: Controlled Data Update ---");
        add.setOperand1(50); // Using setter to update state
        System.out.println("Updated Operand 1 to 50 via setter.");
        System.out.println("New Output (50 + 10): " + add.calculate() + "\n");

        System.out.println("--- Test Case 2.2: Division by Zero ---");
        Division div = new Division(20, 0);
        System.out.print("Output: ");
        double divResult = div.calculate(); // Will print error and return NaN
        System.out.println("Returned value: " + divResult + "\n");

        // Test Case Group 3: Geometry Module
        System.out.println("--- Test Case 3.1: Circle Area Calculation ---");
        Circle circle = new Circle(5);
        System.out.println("Input: Radius = 5");
        System.out.printf("Expected Output: ~78.54\nActual Output: %.2f\n\n", circle.getArea());

        System.out.println("--- Test Case 3.2: Invalid Shape Dimension ---");
        Circle badCircle = new Circle(-3);
        System.out.print("Output: ");
        badCircle.getArea(); // Triggers error message
        System.out.println();

        // Test Case Group 4: Number Analysis Module
        System.out.println("--- Test Case 4.1: Prime Number Check ---");
        NumberAnalyzer primeCheck = new NumberAnalyzer(7);
        System.out.println("Input: 7");
        System.out.println("Is Prime? " + primeCheck.isPrime() + "\n");

        System.out.println("--- Test Case 4.2: Non-Prime Number Check ---");
        primeCheck.setOperand1(10); // Code reuse and state modification
        System.out.println("Input: 10");
        System.out.println("Is Prime? " + primeCheck.isPrime() + "\n");

        System.out.println("--- Test Case 4.3: Factorial Computation ---");
        primeCheck.setOperand1(5);
        System.out.println("Input: 5");
        System.out.println("Factorial: " + primeCheck.factorial() + "\n");
        
        // Test Case Group 7: Multiple Object Interaction
        System.out.println("--- Test Case 7.1: Multiple Object Interaction ---");
        Circle c1 = new Circle(10);
        NumberAnalyzer n1 = new NumberAnalyzer(5);
        System.out.println("Circle 1 Area: " + c1.getArea());
        System.out.println("Number Analyzer Factorial: " + n1.factorial());
        System.out.println("Status: Objects maintain independent states successfully.");
    }
}