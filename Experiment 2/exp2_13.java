/*
 * 13.	 Encapsulation and Data Hiding:
•	Design a class BankAccount with attributes like accountNumber, balance, and ownerName.
 Make balance private and provide public methods like deposit, withdraw, and getBalance to access and modify it while maintaining data integrity.

 */
import java.util.Scanner;

class BankAccount{
    String ownerName;
    long accountNumber;
    long balance;

    Scanner sc=new Scanner(System.in);

    public BankAccount(String ownerName, long accountNumber, long balance){
        this.ownerName=ownerName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void deposit(){
        System.out.println("Enter Amount you want to deposit");
        long deposit_amount=sc.nextLong();
        balance=balance+deposit_amount;
        System.out.println("Amount deposited succesfully");
    }

    public void withdraw(){
        System.out.println("Enter Amount you want to Withdraw");
        long withdraw_amount=sc.nextLong();
        balance=balance-withdraw_amount;
        System.out.println("Amount withdraw succesfully");
    }

    public void getBalance(){
        System.out.println("Current Balance:"+balance);
    }

    public void display_account_details(){
        System.out.println("\nOwner Name:"+ownerName);
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Balance:"+balance);
    }
}
 public class exp2_13 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        BankAccount b1=new BankAccount("Prathmesh", 1022031066, 6300);

        int choice;
        do{
        System.out.println("Enter choice");
        System.out.println("\n1.Deposit\n2.Withdraw\n3.Check Balance\n4.Display Account Details\n5.Exit");
        choice=sc.nextInt();
        
        switch (choice) {
            case 1:
            b1.deposit();
            b1.getBalance();
                break;
            case 2:
                b1.withdraw();
                b1.getBalance();
            case 3:
                b1.getBalance();
                break;
            case 4:
                b1.display_account_details();
                break;
            default:
                break;
        }
    }while(choice!=5);
    }
    
}
