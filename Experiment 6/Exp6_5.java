/* 
  5. Write a Java program to prompt the user to enter an integer value representing their age. However, 
  if the user enters a non-numeric value or a number that cannot be parsed as an integer, 
  the program should catch the NumberFormatException and display an error message, asking the user to enter a valid numeric age.
 */

 import java.util.Scanner;

 public class Exp6_5 {
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
 
         try {
             System.out.println("Enter your age:");
             int age = sc.nextInt();
         } catch (java.util.InputMismatchException e) {
             System.out.println("Error: Enter valid numeric age");
         }
         
         sc.close();
     }
 }
 
 /* 
NumberFormatException is a subclass of IllegalArgumentException and is generally thrown to indicate that
 the application has attempted to convert a string to one of the numeric types, but that the string does not have the appropriate format.
For example, if you attempt to convert the string "abc" to an integer using Integer.parseInt("abc"), a NumberFormatException will be thrown because "abc" cannot
 be converted to an integer. */