/* 2. Write a Java program to calculate the percentage of a student using multi-level inheritance.
  Accept the marks of three subjects in base class.
  A class will derived from the above mentioned class which includes a function to find the total marks obtained and
  another class derived from this class which calculates and displays the percentage of student. */


  /* Multilevel Inheritance */
  import java.util.Scanner;

  class Student {
      int math;
      int science;
      int Eng;
  
      public void get_marks() {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter marks of maths:");
          math = sc.nextInt();
  
          System.out.println("Enter marks of science:");
          science = sc.nextInt();
  
          System.out.println("Enter marks of English:");
          Eng = sc.nextInt();
      }
  }
  
  class total_mark extends Student {
      double Total_Marks; // Declaration moved here
  
      // Method to calculate Total_Marks
      public void calculateTotalMarks() {
          Total_Marks = math + science + Eng;
      }
  
      public void display1() {
          System.out.println("Total Marks: " + Total_Marks);
      }
  }
  
  class Percent extends total_mark {
      public void calculatePercentage() {
          double percentage = Total_Marks / 3.0;
          System.out.println("Percentage: " + percentage);
      }
  }
  
  public class exp3_2 {
      public static void main(String args[]) {
          Percent obj1 = new Percent();
  
          obj1.get_marks(); // Input marks
          obj1.calculateTotalMarks(); // Calculate total marks
          obj1.display1(); // Display total marks
          obj1.calculatePercentage(); // Calculate and display percentage
      }
  }
  