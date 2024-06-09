package geometry;
import java.util.Scanner;

public class Rectangle{
    public void displayArea(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length and breadth of Rectangle");
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        System.out.println("Area of Rectangle is"+(length*breadth));

    }
}