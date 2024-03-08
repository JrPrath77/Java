import java.util.Scanner;
public class calculate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Addition: "+a+"+"+b+"="+(a+b));
        System.out.println("Substraction: "+a+"-"+b+"="+(a-b));
        System.out.println("Multiplication: "+a+"*"+b+"="+(a*b));
        System.out.println("Division: "+a+"/"+b+"="+(a/b));
        System.out.println("Remainder: "+a+"%"+b+"="+(a%b));
    }
}
