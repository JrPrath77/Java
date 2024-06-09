import java.util.Scanner;

class InventoryItem {
    private String name;
    private int quantity;
    private double price;
    private String expirationDate;
    private String category;

    // Constructor
    public InventoryItem(String name, int quantity, double price, String expirationDate, String category) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.expirationDate = expirationDate;
        this.category = category;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getCategory() {
        return category;
    }

    // Setter methods with basic validation
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Error: Quantity cannot be negative.");
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative.");
        }
    }

    public void setExpirationDate(String expirationDate) {
        // Add more sophisticated date validation if needed
        this.expirationDate = expirationDate;
    }

    // Display method
    public void displayItemDetails() {
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Category: " + category);
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        // Example usage
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String name = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter expiration date: ");
        String expirationDate = scanner.nextLine();

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        // Create an inventory item
        InventoryItem item = new InventoryItem(name, quantity, price, expirationDate, category);

        // Display item details
        item.displayItemDetails();

        // Modify item quantity with validation
        System.out.print("Enter new quantity: ");
        int newQuantity = scanner.nextInt();
        item.setQuantity(newQuantity);

        // Display updated item details
        item.displayItemDetails();

        // Close the scanner
        scanner.close();
    }
}
