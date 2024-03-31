/* 1.	You are required to develop a Java program that implements an interface to perform basic arithmetic operations.
 The interface, named "ArithmeticOperations," should define four methods: add, subtract, multiply, and divide. 
 The program should also include a class named "Calculator" that implements the "ArithmeticOperations" interface.

The "add" method should take two integers as parameters and return their sum.
The "subtract" method should take two integers as parameters and return their difference.
The "multiply" method should take two integers as parameters and return their product.
The "divide" method should take two integers as parameters and return their quotient as a floating-point number.

In the "Calculator" class, implement the methods defined in the "ArithmeticOperations" interface. 
Create an instance of the "Calculator" class and demonstrate the usage of each method by performing arithmetic operations on different pairs of numbers.

Ensure that the program is user-friendly and provides clear instructions for inputting the numbers and displaying the results.
 */

import java.util.Scanner;
interface ArithmaticOperations{
    public int add(int a,int b);
    public int subtract(int a,int b);
    public int multiply(int a,int b);
    public float divide(int a,int b);
}

class Calculator implements ArithmaticOperations{
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public float divide(int a,int b){
        return a/b;
    }

}
class exp4_1{
    public static void main(String args[]){
        Calculator c1=new Calculator();
        Scanner sc= new Scanner(System.in);
        int a,b,choice;

        do{
            System.out.println("\nEnter Choice");
            System.out.println("\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter two numbers");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    int sum=c1.add(a,b);
                    System.out.print("\nSum:"+sum);
                    break;
                case 2:
                    System.out.println("Enter two numbers");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    int subtraction=c1.subtract(a,b);
                    System.out.print("\nSubtraction:"+subtraction);
                    break;
                case 3:
                    System.out.println("Enter two numbers");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    int multiplication=c1.multiply(a,b);
                    System.out.print("\nMultiplication:"+multiplication);
                    break;
                case 4:
                    System.out.println("Enter two numbers");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    float division=c1.divide(a,b);
                    System.out.print("\nDivision:"+division);
                    break;
                case 5:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Enter valid choice");
            }
        }while(choice!=5);
    }

}