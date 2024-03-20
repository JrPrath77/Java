/* 12.	 Model a Student class: Attributes: name, roll number, marks (array)
Methods: getAverageMarks(), getHighestMark()
 */

 import java.util.Scanner;

class Student{
    String name;
    int roll_num;
    double[] marks = new double[5]; // Initialize marks array
    double total;
    double max=marks[0];

    Scanner sc=new Scanner(System.in);
    public void get_info(){
        System.out.println("Enter Name:");
        name=sc.nextLine();
        System.out.println("Enter Roll Number:");
        roll_num=sc.nextInt();

    }
    public void getMarks(){
        System.out.println("Enter marks of 5 subjects:");
        for(int i=0; i<5; i++){
            marks[i]=sc.nextDouble();
        }
    }

    public void getAverageMarks(){
        for(int i=0; i<5; i++){
         total+=marks[i];
        }
        System.out.println("Average Marks:"+(total/5));
    }

    public void getHighestMark(){
        for(int i=0; i<5; i++){
            if(max<marks[i]){
                max=marks[i];
            }
        }
System.out.println("Highest Marks: " + max);
    }
}
 public class exp2_12 {
    public static void main(String args[]){
        Student s1=new Student();
        s1.get_info();
        s1.getMarks();
        s1.getAverageMarks();
        s1.getHighestMark();
    }
}
