/* 2.
Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
 Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
*/

import java.util.Scanner;

class Student { // Class name should start with uppercase

    private String name;
    private int rollNo; // Consistent variable naming (camelCase)

    public Student(String name, int rollNo) { // Constructor to initialize
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}

public class Exp2_2 { // Class name should start with uppercase

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Correct object creation for Scanner

        Student prathmesh = new Student("John", 2); // Create Student object

        // No need to call student() within main (it's a constructor)
        System.out.println("Student Name: " + prathmesh.getName());
        System.out.println("Student Roll Number: " + prathmesh.getRollNo());

        sc.close();
    }
}