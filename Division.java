public class Division extends MathOperation {
    
    public Division(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double calculate() {
        // Robust method design: Input validation to prevent crashing
        if (getOperand2() == 0) {
            System.err.println("Error: Division by zero is undefined.");
            return Double.NaN; // Return 'Not a Number' for safe handling
        }
        return getOperand1() / getOperand2();
    }
}