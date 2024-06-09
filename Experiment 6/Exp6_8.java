/* 
 8. Write a Java program that demonstrates exception handling using the finally block. The
program should attempt to perform a task that might throw an exception, such as
dividing by zero or accessing an out-of-bounds index in an array. Regardless of whether
an exception occurs or not, the program should include a finally block to execute
cleanup code, such as closing resources or releasing locks.
 */
public class Exp6_8 {
    public static void main(String[] args) {
        try {
            // Attempting division by zero
            int result = divideByZero();
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } finally {
            // Cleanup code
            System.out.println("Cleanup code executed.");
        }
    }

    // Method to demonstrate division by zero
    public static int divideByZero() {
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;
    }
}
