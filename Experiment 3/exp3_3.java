/* 3.	Write a Java program to design a base class Person (name, address, phone_no). 
Derive a class Employee (eno, ename) from Person. 
Derive a class Manager (designation, department name, basic-salary) from Employee. 
Write a menu driven program to:

a. Accept all details of 'n' managers.
b. Display manager having highest salary
 */
import java.util.Scanner;

class Person {
    String name;
    String address;
    String phone_no;

    public void get_info() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = sc.nextLine();

        System.out.println("Enter Address:");
        address = sc.nextLine();

        System.out.println("Enter Phone no:");
        phone_no = sc.nextLine();
    }
}

class Employee extends Person {
    String ename;
    String eno;

    public void get_einfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter eName:");
        ename = sc.nextLine();

        System.out.println("Enter eno:");
        eno = sc.nextLine();
    }
}

class Manager extends Employee {
    String designation;
    String departmentName;
    double basicSalary;

    public void get_additional_info() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Designation:");
        designation = sc.nextLine();

        System.out.println("Enter Department Name:");
        departmentName = sc.nextLine();

        System.out.println("Enter Basic Salary:");
        basicSalary = sc.nextDouble();
    }
}

public class exp3_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the number of managers:");
        n = sc.nextInt();

        Manager[] managers = new Manager[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of manager " + (i + 1) + ":");
            managers[i] = new Manager();
            managers[i].get_info();
            managers[i].get_einfo();
            managers[i].get_additional_info();
        }

        // Finding manager with highest salary
        Manager managerWithHighestSalary = managers[0];
        for (int i = 1; i < n; i++) {
            if (managers[i].basicSalary > managerWithHighestSalary.basicSalary) {
                managerWithHighestSalary = managers[i];
            }
        }

        // Displaying manager with highest salary
        System.out.println("Manager with the highest salary:");
        System.out.println("Name: " + managerWithHighestSalary.name);
        System.out.println("Employee Number: " + managerWithHighestSalary.eno);
        System.out.println("Designation: " + managerWithHighestSalary.designation);
        System.out.println("Department Name: " + managerWithHighestSalary.departmentName);
        System.out.println("Basic Salary: " + managerWithHighestSalary.basicSalary);
    }
}
