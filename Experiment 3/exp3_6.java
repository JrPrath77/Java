/* 6.	Write a Program using class to process Shopping List for a Departmental Store. 
The list include details such as the Code No and Price of each item and perform the operations 
like Adding, Deleting Items to the list and Printing the Total value of a Order. */

import java.util.ArrayList;
import java.util.Scanner;

class ShoppingItem {
    private int codeNo;
    private String name;
    private double price;

    public ShoppingItem(int codeNo, String name, double price) {
        this.codeNo = codeNo;
        this.name = name;
        this.price = price;
    }

    public int getCodeNo() {
        return codeNo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingList {
    private ArrayList<ShoppingItem> items;

    public ShoppingList() {
        items = new ArrayList<>();
    }

    public void addItem(ShoppingItem item) {
        items.add(item);
    }

    public void deleteItem(int codeNo) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getCodeNo() == codeNo) {
                items.remove(i);
                System.out.println("Item with code no " + codeNo + " deleted successfully.");
                return;
            }
        }
        System.out.println("Item with code no " + codeNo + " not found.");
    }

    public void printList() {
        System.out.println("\tCode No\tName\tPrice");
        for (ShoppingItem item : items) {
            System.out.println("\t" + item.getCodeNo() + "\t" + item.getName() + "\t$" + item.getPrice());
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (ShoppingItem item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

public class exp3_6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ShoppingList shoppingList = new ShoppingList();

        int choice;
        do {
            System.out.println("\nEnter Choice:");
            System.out.println("\t1. Add item\n\t2. Delete item\n\t3. Print list\n\t4. Print total value\n\t5. Exit\n");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter item details:");
                    System.out.print("Code No: ");
                    int codeNo = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    shoppingList.addItem(new ShoppingItem(codeNo, name, price));
                    break;
                case 2:
                    System.out.print("Enter code no of item to delete: ");
                    int deleteCodeNo = sc.nextInt();
                    shoppingList.deleteItem(deleteCodeNo);
                    break;
                case 3:
                    shoppingList.printList();
                    break;
                case 4:
                    System.out.println("Total value of the order: $" + shoppingList.calculateTotal());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Enter valid choice.");
            }
        } while (choice != 5);
    }
}
