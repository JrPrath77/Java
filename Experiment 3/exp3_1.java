/* 1.	Write a Java program to add two numbers using single inheritance.
 Accept these two numbers from the user in base class and display the sum of these two numbers in derived class. */

import java.util.Scanner;

 class add {
    int first_no;
    int second_no;
   public void take_num(){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter first no:");
    first_no= sc.nextInt();
    System.out.println("Enter second no:");
    second_no= sc.nextInt();
    sc.close();
   }
    
}

class child1 extends add{
    void display(){
        int sum= first_no+second_no;
        System.out.println("Additon of "+first_no+"+"+second_no+"="+sum);
    }
}

public class exp3_1 {
    public  static void main (String args[]){ 
        child1 obj= new child1();
        obj.take_num();
        obj.display();

}
}