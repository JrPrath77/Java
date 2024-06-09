/* 3. Online Store (Code Reusability and Maintainability):
•	Develop classes for Product, ShoppingCart, and Order.
•	Create a package named ecommerce.
•	Include the Product, ShoppingCart, and Order classes within this package.
•	Consider creating a separate package named paymentProcessing for classes like PaymentGateway
    and CreditCard if your store handles online payments.
•	This separation allows you to reuse the core functionalities (Product, ShoppingCart, Order) 
in different parts of your application while keeping payment-related code organized and encapsulated.
 */
import ecommerce.*;
import paymentProcessing.*;
import java.util.Scanner;

public class Exp5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product("Sugar", 40);
        Product p2 = new Product("Rice", 70);
        Product p3 = new Product("Wheat", 42);
        Product p4 = new Product("Potato", 40);
        ShoppingCart s1 = new ShoppingCart();
        PaymentGateway paymentGateway = new PaymentGateway();

        double totalCost = 0;
        int choice;
        do {
            System.out.println("\nEnter Choice:");
            System.out.println("1. Show all products\n2. Add products to cart\n3. Calculate Total Cost\n4. Pay Amount\n5. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Product.showProducts();
                    break;
                case 2:
                    System.out.println("Enter Serial Number to add product");
                    int serialNo = sc.nextInt();
                    switch (serialNo) {
                        case 1:
                            s1.addProduct(p1);
                            break;
                        case 2:
                            s1.addProduct(p2);
                            break;
                        case 3:
                            s1.addProduct(p3);
                            break;
                        case 4:
                            s1.addProduct(p4);
                            break;
                        default:
                            System.out.println("Invalid Serial Number.");
                    }
                    break;
                case 3:
                    totalCost = s1.calculateTotalCost();
                    System.out.println("Total cost: " + totalCost);
                    break;
                    case 4:
                    System.out.println("Enter Amount to pay");
                    int amountPaying = sc.nextInt();
                    sc.nextLine(); // Consume the newline character
                    System.out.println("Enter Credit Card Number (16 digit)");
                    String cardNumber = sc.nextLine();
                    
                                   
                    System.out.print("Enter Expiry Date:");
                    String expirationDate = sc.nextLine();
                    System.out.println("Enter Card Holder Name:");
                    String cardholderName = sc.nextLine();
                    System.out.println("Enter CVV:");
                    int cvv = sc.nextInt();
                    
                    CreditCard creditCard = new CreditCard(cardNumber, expirationDate, cardholderName, cvv);
                    
                    // Call validateCardDetails() method to check if the card number is valid
                     boolean isCardValid = creditCard.validateCardNumber(cardNumber);
                     if (!isCardValid) {
                         System.out.println("Invalid credit card number format. Please enter a 16-digit card number.");
                         break; // Exit the switch statement
                     }
                    paymentGateway.processPayment(amountPaying, totalCost);
                    break;
                
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        sc.close(); // Close the scanner
    }
}
