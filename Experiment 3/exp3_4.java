
/* 4.	Write a Java program to define a base class Item (item-no, name, price). Derive a class Discounted-Item (discount-percent).
 A customer purchases 'n' items. Display the item-wise bill and total amount using appropriate format. */
 
 import java.util.Scanner;

 class Item {
     String item_name;
     int item_no;
     double cost_price;
 
     public Item(int item_no, String item_name, double cost_price) {
         this.item_name = item_name;
         this.item_no = item_no;
         this.cost_price = cost_price;
     }
 
     public double getCostPrice() {
         return cost_price;
     }
 
     public String toString() {
         return "Item-no: " + item_no + ", Name: " + item_name + ", Cost Price: $" + cost_price;
     }
 }
 
 class DiscountedItem extends Item {
     double discount;
     double selling_price;
 
     public DiscountedItem(int item_no, String item_name, double cost_price, double discount) {
         super(item_no, item_name, cost_price);
         this.discount = discount;
         calculateDiscountedPrice();
     }
 
     public void calculateDiscountedPrice() {
         selling_price = cost_price - (cost_price * (discount / 100));
     }
 
     public double getDiscountedPrice() {
         return selling_price;
     }
 
     public String toString() {
         return super.toString() + ", Discounted Price: $" + selling_price + " (Discount: " + discount + "%)";
     }
 }
 
 public class exp3_4{
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         
         // Number of items to purchase
         System.out.print("Enter the number of items to purchase: ");
         int n = sc.nextInt();
         
         // Array to store items
         Item[] items = new Item[n];
         
         // Input items data
         for (int i = 0; i < n; i++) {
             System.out.println("Enter details for item " + (i + 1) + ":");
             System.out.print("Item-no: ");
             int item_no = sc.nextInt();
             sc.nextLine(); // Consume newline
             System.out.print("Name: ");
             String item_name = sc.nextLine();
             System.out.print("Cost Price: ");
             double cost_price = sc.nextDouble();
             System.out.print("Discount (%): ");
             double discount = sc.nextDouble();
             items[i] = new DiscountedItem(item_no, item_name, cost_price, discount);
         }
 
         // Display item-wise bill
         System.out.println("\nItem-wise Bill:");
         System.out.println("\tItem-no\tName\tCost Price\tDiscount\tSelling Price");
         double totalAmount = 0;
         for (Item item : items) {
             totalAmount += ((DiscountedItem) item).getDiscountedPrice();
             System.out.println("\t" + item.item_no + "\t" + item.item_name + "\t$" + item.cost_price + "\t\t" + ((DiscountedItem) item).discount + "%\t\t$" + ((DiscountedItem) item).getDiscountedPrice());
         }
 
         // Display total amount
         System.out.println("\nTotal Amount: $" + totalAmount);
 
         sc.close();
     }
 }
 




