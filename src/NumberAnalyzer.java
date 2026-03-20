public class NumberAnalyzer extends MathOperation {

    // operand1 acts as the number to be analyzed
    public NumberAnalyzer(double number) {
        super(number, 0); 
    }

    // calculate() acts as a dummy or default implementation for the base requirement
    @Override
    public double calculate() {
        return getOperand1(); 
    }

    public boolean isPrime() {
        int num = (int) getOperand1();
        if (num <= 1) return false;
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public long factorial() {
        int num = (int) getOperand1();
        if (num < 0) {
            System.err.println("Error: Factorial of a negative number is undefined.");
            return -1;
        }
        
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public boolean isEven() {
        return ((int) getOperand1()) % 2 == 0;
    }
}