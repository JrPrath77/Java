/* 3. Problem Statement: Create a Java program that implements an interface called "Shape" to represent different geometric shapes.
The interface should contain the following methods:
calculateArea(): This method should be used to calculate the area of the shape and return it as a double.
calculatePerimeter(): This method should be used to calculate the perimeter of the shape and return it as a double.
Create three classes that implement the "Shape" interface: "Circle", "Rectangle", and "Triangle".
Each class should provide its own implementation for the calculateArea() and calculatePerimeter() methods.
Write a main program that demonstrates the usage of these classes. Create objects of each class, set appropriate values for their dimensions, and
 display the calculated area and perimeter of each shape.
 */
import java.util.Scanner;
interface Shape{
    double calculateArea();
    double calculatePerimeter();
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
    public double calculatePerimeter(){
        return 2*3.14*radius;
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
     public double calculatePerimeter(){
        return 2*(length+breadth);
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
     public double calculatePerimeter(){
        double hypotenus_square= base*height;
        double hypotenus=Math.sqrt(hypotenus_square);
        return (base+height+ hypotenus);
     }
}
class exp4_3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int choice;
        double a,b;
        double area,perimeter;
        do{
            System.out.println("\n\nEnter Choice");
            System.out.println("1.Area and perimeter of Circle\n2.Area and perimeter of Rectangle\n3.Area of and perimeter a Triangle\n4.Exit");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter radius");
                    a=sc.nextInt();
                    Circle c=new Circle(a);
                    area=c.calculateArea();
                    perimeter=c.calculatePerimeter();
                    System.out.print("\nArea of Circle:"+area);
                    System.out.print("\nPerimeter of Circle:"+perimeter);
                    break;
                case 2:
                    System.out.println("Enter Length and breadth ");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    Rectangle r=new Rectangle(a,b);
                    area=r.calculateArea();
                    perimeter=r.calculatePerimeter();
                    System.out.print("\nArea of Rectangle:"+area);
                    System.out.print("\nPerimeter  of Rectangle:"+perimeter );
                    break;
                case 3:
                    System.out.println("Enter base and height");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    Triangle t=new Triangle(a,b);
                    area=t.calculateArea();
                    perimeter=t.calculatePerimeter();
                    System.out.print("\nArea of a Triangle:"+area);
                    System.out.print("\nPerimeter of a Triangle:"+perimeter);
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
