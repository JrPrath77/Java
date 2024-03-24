/* 5.	Write a Program to design a class having static member function named showcount() 
which has the property of displaying the number of objects created of the class. */

class MyClass {
    // Static member variable to keep track of the number of objects created
    private static int count = 0;

    // Constructor to increment the count when an object is created
    public MyClass() {
        count++;
    }

    // Static method to display the number of objects created
    public static void showCount() {
        System.out.println("Number of objects created: " + count);
    }
}

public class exp3_5 {
    public static void main(String[] args) {
        // Creating objects of MyClass
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        // Calling the static method showCount() to display the count
        MyClass.showCount();
    }
}
