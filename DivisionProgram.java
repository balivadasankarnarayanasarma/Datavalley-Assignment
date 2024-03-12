public class DivisionProgram {

    public static void main(String[] args) {
        divideNumbers(10, 2);
        divideNumbers(5, 0);
    }

    public static void divideNumbers(int numerator, int denominator) {
        try {
            if (denominator == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
