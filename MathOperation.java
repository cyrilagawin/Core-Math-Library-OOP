public abstract class MathOperation {
    // Encapsulation: Attributes are private to protect data
    private double operand1;
    private double operand2;

    // Constructor to initialize the operation
    public MathOperation(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    // Controlled Access: Public getters and setters
    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    // Abstract method defining the common interface for all child classes
    public abstract double calculate();
}