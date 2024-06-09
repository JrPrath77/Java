/* 
 1. Write a Java program that prompts the user to enter two integers. Perform division
    operation on these integers and handle the ArithmeticException that may occur if the
    second integer is zero. Display an appropriate error message if the second integer is
    zero, otherwise display the result of the division operation.
 */

 import java.util.Scanner;

 public class Exp6_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();

        try{
            int result=a/b;
            System.out.println("Result: "+result);
        }catch(ArithmeticException e){
            System.out.println("Error: Can not divide by zero");
        }finally{
            sc.close();
        }
    }
 }