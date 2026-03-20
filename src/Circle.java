public class Circle extends MathOperation {

    // operand1 will act as the radius. We pass 0 for operand2 as it is unused.
    public Circle(double radius) {
        super(radius, 0); 
    }

    @Override
    public double calculate() {
        return getArea(); // Default calculation for a shape
    }

    public double getArea() {
        if (getOperand1() < 0) {
            System.err.println("Error: Radius cannot be negative.");
            return Double.NaN;
        }
        return Math.PI * Math.pow(getOperand1(), 2);
    }

    public double getCircumference() {
        if (getOperand1() < 0) {
            System.err.println("Error: Radius cannot be negative.");
            return Double.NaN;
        }
        return 2 * Math.PI * getOperand1();
    }
}