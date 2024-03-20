/* 7.	Write a program to print the area of a rectangle by creating a class named 'Area' 
taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. 
Length and breadth of rectangle are entered through keyboard. */

import java.util.Scanner;
public class exp2_7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        double length=sc.nextDouble();

        System.out.println("Enter breadth of rectangle:");
        double breadth=sc.nextDouble();

        Area a1=new Area(length,breadth);
        System.out.println("Area of rectangle is:"+a1.returnArea());

    }
    
}
class Area{
    double length,breadth;
    public Area(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double returnArea(){
        return length*breadth;
    }
}