/* 5. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
by creating a class named 'Triangle' with constructor having the three sides as its parameters. */


public class exp2_5 {
    public static void main(String args[]){
        Triangle t1=new Triangle(3, 4, 5);
        t1.getArea();
        t1.perimeter();
    }
}

class Triangle{
    double  a,b,c;
    public Triangle(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public void getArea(){
        double s = (a + b + c) / 2.0 ;
       double area = Math.sqrt(s*(s - a)*(s - b)*(s - c));
        System.out.println("Area of triangle is:"+area);
    }

    public void perimeter(){
        double peri;
        peri=a+b+c;
        System.out.println("Perimeter of triangle is:"+peri);
    }
}
