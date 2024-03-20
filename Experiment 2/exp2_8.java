/* 8. Print the average of three numbers entered by user by 
creating a class named 'Average' having a method to calculate and print the average. */

import java.util.Scanner;
public class exp2_8 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter second Number");
        int b=sc.nextInt();
        System.out.println("Enter third Number");
        int c=sc.nextInt();

        Average a1=new Average(a,b,c);
        a1.printAverage();
    }
    
}

class Average{
    int a,b,c;
    public Average(int a,int b, int c ){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void printAverage(){
        System.out.println("Average of three numbers is:"+((a+b+c)/3));
    }
}