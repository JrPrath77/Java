/*
  6. Write a Java program that demonstrates exception handling using multiple catch blocks.
The program should include code that potentially throws exceptions of different types,
such as ArithmeticException, ArrayIndexOutOfBoundsException, and
NullPointerException. Implement separate catch blocks for each type of exception to
handle them appropriately, displaying meaningful error messages for each scenario
 */
public class Exp6_6 {
        public static void main(String[] args) {
            // Potential exceptions: ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException
            try {
                // Example 1: ArithmeticException
                int result = 10 / 0; // Attempting to divide by zero
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception occurred: " + e.getMessage());
            }
    
            try {
                // Example 2: ArrayIndexOutOfBoundsException
                int[] arr = new int[5];
                int value = arr[10]; // Accessing an element outside the bounds of the array
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
            }
    
            try {
                // Example 3: NullPointerException
                String str = null;
                int length = str.length(); // Attempting to call a method on a null reference
            } catch (NullPointerException e) {
                System.out.println("NullPointerException occurred: " + e.getMessage());
            }
        }
    }
    
