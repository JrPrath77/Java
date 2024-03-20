/* 3.	Assign and print the roll number, phone number and address of two students 
having names "Sam" and "John" respectively by creating two objects of class 'Student'. */

import java.util.Scanner;

class Student{
    String name,address;
    int roll_no;
    double phone_no;

    public void get_info(){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter name:");
        name=sc.nextLine();

        System.out.println("Enter roll number");
        roll_no=sc.nextInt();

        System.out.println("Enter phone number:");
        phone_no= sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter address :");
        address=sc.nextLine();
    }

    public void display(){
        System.out.println("");
        System.out.println("Name:"+name);
        System.out.println("Roll Number:"+roll_no);
        System.out.println("Phone Number:"+phone_no);
        System.out.println("Address:"+address);
    }
    
}
public class student_Info {
    public static void main(String args[])  {

        Student s1= new Student();
        Student s2= new Student();

        s1.get_info();
        s2.get_info();

        s1.display();
        s2.display();
    }
}
