/* 
 4.Create a Java program to handle the "ArrayIndexOutOfBoundsException" exception
class. Prompt the user to input the size of an array and then attempt to access an
element at an index beyond the array's bounds. Implement exception handling to
gracefully handle this situation and display a user-friendly error message indicating that
the index is out of bounds.
Your program should:
Ask the user to input the size of the array.
Create an array of the specified size.
Try to access an element at an index beyond the array's bounds.
Handle the "ArrayIndexOutOfBoundsException" exception and display an appropriate
error message.
 */
import java.util.Scanner;
public class Exp6_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        try {
            int indexOutOfRange = array[size];
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the "ArrayIndexOutOfBoundsException" exception and display an appropriate error message
            System.out.println("Error: Index is out of bounds!");
            System.out.println("Array size is " + size + ", so the maximum index is " + (size - 1));
        }
        scanner.close();
    }
}


