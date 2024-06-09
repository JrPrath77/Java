/*1. Create a Java program that demonstrates the use of various data types and their limitations.

Tasks:
Declare and initialize variables of different data types (int, double, char, boolean).
Perform arithmetic operations (addition, subtraction, multiplication, division) on integer and double variables.
Demonstrate type conversion (casting) between data types.
Display the values of variables along with their data types. */

public class DataTypesDemo {
    public static void main(String args[]){
        int a=10,b=8;
        double c=5.5,d=6.7;
        char charValue='A';
        boolean booleanValue = true;

        // Display values along with their data types
        System.out.println("Integer Value:"+a+" (Type:"+Integer.TYPE+")");
        System.out.println("Integer Value:"+c+" (Type:"+Double.TYPE+")");
        System.out.println("Integer Value:"+charValue+" (Type:"+Character.TYPE+")");
        System.out.println("Integer Value:"+booleanValue+" (Type:"+Character.TYPE+")");

        //Arithmatic operations
        System.out.println("Addition: "+a+"+"+b+"="+(a+b));
        System.out.println("Substraction: "+a+"-"+b+"="+(a-b));
        System.out.println("Multiplication: "+a+"*"+b+"="+(a*b));
        System.out.println("Division: "+a+"/"+b+"="+(a/b));

        System.out.println("Addition: "+c+"+"+d+"="+(c+d));
        System.out.println("Substraction: "+c+"-"+d+"="+(c-d));
        System.out.println("Multiplication: "+c+"*"+d+"="+(c*d));
        System.out.println("Division: "+c+"/"+d+"="+(c/d));


        //Demonstrate type conversion (casting) between data types.
        int dobule_to_int_typecast= (int) c; // c is double type and it will be converted to integer  c=5.5 will become c-=5
        double int_to_double_typecast=a;// a=10 will become 10.0
    }
}
