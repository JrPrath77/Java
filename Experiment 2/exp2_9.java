/* 9.Print the sum, difference and product of two complex numbers 
by creating a class named 'Complex' with separate methods for each operation
 whose real and imaginary parts are entered by user. */

 import java.util.Scanner;
 class Complex{
    double a,b,c,d;
    public Complex(double a, double b, double c,double d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    public void printSum(){
        double real_sum=a+c;
        double img_sum=b+d;
        System.out.println("Sum: ("+a+"+ i"+b+") + ("+c+"+ i"+d+") = ("+real_sum+"+ i"+img_sum+")");
    }
    public void difference(){
        double real_diff=a-c;
        double img_diff=b-d;
        System.out.println("Difference: ("+a+"+ i"+b+") -  ("+c+"+ i"+d+") = ("+real_diff+"+i"+img_diff+")");
    }
    public void product(){
        double real_product= (a*c-b*d); // (a + ib)*(c + id) = (ac - bd) + i(ad + bc).
        double img_product=(a*d+b*c);
        System.out.println("Product: ("+a+"+ i"+b+") * ("+c+"+ i"+d+")= ("+real_product+"+i"+img_product+")");
    }
 }
 public class exp2_9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first complex number");
        System.out.println("Enter real part:");
        double a=sc.nextDouble();
        System.out.println("Enter imaginary part:");
        double b=sc.nextDouble();

        System.out.println("Enter second complex number");
        System.out.println("Enter real part:");
        double c=sc.nextDouble();
        System.out.println("Enter imaginary part:");
        double d=sc.nextDouble();

        Complex c1=new Complex(a,b,c,d);
        c1.printSum();
        c1.difference();
        c1.product();

        sc.close();
    }
}
