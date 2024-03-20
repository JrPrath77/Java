/* 6.	Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by
creating a class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed as parameters to its constructor. */

class Rectangle{
    double length,breadth;
    public Rectangle(double length, double breadth){
        this.length=length;   // Assigning parameter length to class variable
        this.breadth=breadth;  // Assigning parameter breadth to class variable
    }
    public double Area(){
        return length*breadth;
    }
}

public class exp2_6 {
    public static void main(String args[]){
        Rectangle r1=new Rectangle(4, 5);
        Rectangle r2=new Rectangle(5, 8);

        System.out.println("Area of rectangle(4,5):"+r1.Area());
        System.out.println("Area of rectangle(5,8):"+r2.Area());
        
    }
}