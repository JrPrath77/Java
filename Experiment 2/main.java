/*   4.	Write a program to print the area and perimeter of a triangle
 having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor. */

public class main {
    public static void main (String args[]){
        Triangle t1=new Triangle();
        t1.Area();
        t1.perimeter();
    }
}

class Triangle{
    double area;
    double a=3,b=4,c=5;
    double s = (a + b + c) / 2.0 ;
    public void Area(){
        area = Math.sqrt(s*(s - a)*(s - b)*(s - c));
        System.out.println("Area of triangle is:"+area);
    }

    public void perimeter(){
        double peri;
        peri=a+b+c;
        System.out.println("Perimeter of triangle is:"+peri);
    }
}
