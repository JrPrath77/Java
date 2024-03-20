/*
10.	Write a program that would print the information (name, year of joining, salary, address) of three employees
 by creating a class named 'Employee'. The output should be as follows:

 Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat

 */

 class Employee{
    String name;
    int join_year;
    long salary;
    String address;

    public Employee(String name,int join_year,long salary,String address){
        this.name=name;
        this.join_year=join_year;
        this.salary=salary;
        this.address=address;
    }

    public void display_info(){
        System.out.println("\t"+name+"\t"+join_year+"\t"+salary+"\t"+address);
    }

 }
 
 public class exp2_10 {
    public static void main(String args[]){
        Employee e1=new Employee("Robert",1994,80000,"64C- WallsStreat");
        Employee e2=new Employee("Sam",2000,81000,"68D- WallsStreat");
        Employee e3=new Employee("John",1999,82000,"26B- WallsStreat");

        System.out.println("\tName\tJYear\tSalary\tAddress");
        e1.display_info();
        e2.display_info();
        e3.display_info();
    }
}
