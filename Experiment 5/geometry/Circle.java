package geometry;

import java.util.Scanner;

public class Circle {
    public void displayArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int radius = sc.nextInt();
        System.out.println("Area of circle is " + (3.14 * radius * radius));
    }
}
