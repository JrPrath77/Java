/* 2. Write a Java program to perform basic arithmetic operations such as addition,
subtraction, multiplication, and division. Implement exception handling to catch
arithmetic exceptions such as division by zero. Upon encountering such exceptions, the
program should gracefully handle the error and provide a meaningful message to the
user.
Your program should include the following functionalities:
Accept two integer inputs from the user.
Perform addition, subtraction, multiplication, and division operations on the input
numbers.
Implement exception handling to catch arithmetic exceptions, specifically division by
zero.
Display the result of each operation or an appropriate error message if an arithmetic
exception occurs.
 */

 import java.util.Scanner;
public class Exp6_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first integer");
        int a=sc.nextInt();
        System.out.println("Enter Second integer");
        int b=sc.nextInt();

        int Result;
        Result=a+b;
        System.out.println("Addition:"+Result);
        Result=a-b;
        System.out.println("Subtraction:"+Result);
        Result=a*b;
        System.out.println("Multiplication:"+Result);

        try{
            Result=a/b;
            System.out.println("Division:"+Result);
        }catch(ArithmeticException e){
            System.out.println("Error:Can not divide by zero");
        }
    }
}
