import java.util.Scanner;


public class Codeshaf{
    public static void main(String args[]) {
Scanner scan= new Scanner(System.in);
       System.out.println("Enter Your Favourite Number:");
        int num =scan.nextInt();
        scan.nextLine();// error if you dont write this line
       System.out.println("Great! What's your name Buddy!?");
String name= scan.nextLine();
    }
}