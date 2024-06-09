/*
4. Write a Java program that accepts an array of integers from the user and prints the element at a specified index. Implement exception handling to catch the ArrayIndexOutOfBoundsException in case the user enters an index that is out of bounds for the array.
Requirements:
The program should prompt the user to enter the size of the array and then the elements of the array. After accepting the array, prompt the user to enter the index of the element they want to retrieve. Implement exception handling to catch ArrayIndexOutOfBoundsException if the user enters an invalid index.
Print the element at the specified index if it is within the array bounds; otherwise, display an error message indicating the invalid index.

Input:
Enter the size of the array: 5
Enter the elements of the array:
10
20
30
40
50
Output:
Enter the index of the element you want to retrieve: 3
Element at index 3: 40
Enter the index of the element you want to retrieve: 7
Index is out of bounds.
 */
import java.util.Scanner;

public class Exp6_3 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int index=sc.nextInt();

        int[] Array =new int[index];

        for(int i=0; i<index; i++){
            System.out.print("Enter "+(i+1)+"th Number:");
            Array[i]=sc.nextInt();
        }

        System.out.println("Enter Which index's number you want to acess from Array");
        int a=sc.nextInt();

        try{
            System.out.println("Element at index"+a+"is"+Array[a]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index out of bound");
        }
       

    }
}
