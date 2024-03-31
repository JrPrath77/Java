/* 2.	Problem Statement: Design an interface in Java to calculate the area of different shapes.
Create an interface named "Shape" that includes the following methods:
calculateArea(): This method should return the area of the shape as a double value.
Next, implement three classes that implement the "Shape" interface:
Circle: This class should have a constructor that takes the radius of the circle as a parameter and implements the calculateArea() method to calculate and return the area of the circle.
Rectangle: This class should have a constructor that takes the length and width of the rectangle as parameters and implements the calculateArea() method to calculate and return the area of the rectangle.
Triangle: This class should have a constructor that takes the base and height of the triangle as parameters and implements the calculateArea() method to calculate and return the area of the triangle.
Write a Java program that demonstrates the usage of the interface and the implemented classes.
 It should create objects of the Circle, Rectangle, and Triangle classes, call the calculateArea() method for each object, and display the calculated areas.
 */
import java.util.Scanner;
interface Shape{
    double calculateArea();
}
class Circle implements Shape{
    private
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return 3.14*radius*radius;
    }

}
class Rectangle implements Shape{
    private
    double length;
    double breadth;

    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
     public double calculateArea(){
        return length*breadth;
     }

}
class Triangle implements Shape{
    private
    double base;
    double height;
     public Triangle(double base,double height){
        this.base=base;
        this.height=height;
     }
     public double calculateArea(){
        return 0.5*base*height;
     }
}
class exp4_2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);       
        int choice;
        double a,b;
        double area;
        do{
            System.out.println("\nEnter Choice");
            System.out.println("\n1.Area of Circle\n2.Area of Rectangle\n3.Area of a Triangle\n4.Exit");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter radius");
                    a=sc.nextInt();
                    Circle c=new Circle(a);
                    area=c.calculateArea();
                    System.out.print("\nArea of Circle:"+area);
                    break;
                case 2:
                    System.out.println("Enter Length and breadth ");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    Rectangle r=new Rectangle(a,b);
                    area=r.calculateArea();
                    System.out.print("\nArea of Rectangle:"+area);
                    break;
                case 3:
                    System.out.println("Enter base and height");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    Triangle t=new Triangle(a,b);
                    area=t.calculateArea();
                    System.out.print("\nArea of a Triangle:"+area);
                    break;
                
                case 4:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Enter valid choice");
            }
        }while(choice!=4);
    }


}
