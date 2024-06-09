/*
 7. Write a Java program to handle exceptions using a finally block. 
 The program should prompt the user to input two integers, divide the first integer by the second integer,
  and handle any possible exceptions that may occur during the division operation. Ensure that the program always closes any open resources,
   such as scanner objects, regardless of  whether an exception occurs or not.
 */

 import java.util.InputMismatchException;
 import java.util.Scanner;
 
 public class Exp5_7 {
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         try {
             System.out.println("Enter first integer");
             int a = sc.nextInt();
 
             System.out.println("Enter Second integer");
             int b = sc.nextInt();
 
             int result = a / b;
             System.out.println("Division is " + result);
 
         } catch (InputMismatchException e) {
             System.out.println("Error: Please enter valid integers.");
         } catch (ArithmeticException e) {
             System.out.println("Error: Can not divide by zero");
         } finally {
             sc.close();
         }
     }
 }
 