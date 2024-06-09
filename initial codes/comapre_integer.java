import java.util.Scanner;
public class comapre_integer {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number");
        int a =sc.nextInt();
        System.out.println("Enter Second number");
        int b =sc.nextInt();
        System.out.println("Enter third number");
        int c =sc.nextInt();

        if(a<b){
            if(b<c){
                System.out.println("True");
            }
        }else{
            System.out.println("False");
        }
    }
}
