/* This program defines a Student class with data members sname, marks, total, and Tmax. 
It has methods assign() to assign initial values and compute() to compute total marks obtained, average, and display the data. 
In the main method, it takes input for student name, marks of 5 subjects, and total maximum marks, 
then creates an object of Student class and calls the assign() and compute() methods. */


import java.util.Scanner;

class Student {
    private String sname;
    private int[] marks;
    private int total;
    private int Tmax;

    // Constructor to initialize the data members
    public Student() {
        sname = "";
        marks = new int[5]; // Assuming 5 subjects
        total = 0;
        Tmax = 0;
    }

    // Method to assign initial values
    public void assign(String name, int[] studentMarks, int maxMarks) {
        sname = name;
        marks = studentMarks;
        Tmax = maxMarks;
    }

    // Method to compute total marks obtained and display data
    public void compute() {
        for (int mark : marks) {
            total += mark;
        }

        System.out.println("Student Name: " + sname);
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks Obtained: " + total);
        System.out.println("Total Maximum Marks: " + Tmax);
        System.out.println("Average Marks: " + ((double) total / marks.length));
    }
}

public class  exp3_11  {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Create an object of class Student
        Student student = new Student();

        // Input for student name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        // Input for marks of 5 subjects
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Input for total maximum marks
        System.out.print("Enter total maximum marks: ");
        int maxMarks = scanner.nextInt();

        // Call assign() method to assign initial values
        student.assign(name, marks, maxMarks);

        // Call compute() method to compute total marks obtained and display data
        student.compute();
    }
}


