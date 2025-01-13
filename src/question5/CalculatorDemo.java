package question5;

public class CalculatorDemo {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        // Perform basic operations
        System.out.println("Addition: " + calculator.add(10, 5));
        System.out.println("Subtraction: " + calculator.subtract(10, 5));
        System.out.println("Multiplication: " + calculator.multiply(10, 5));

        try {
            System.out.println("Division: " + calculator.divide(10, 5)); // Valid division
            System.out.println("Division: " + calculator.divide(10, 0)); // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}