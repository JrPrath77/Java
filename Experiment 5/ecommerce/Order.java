package ecommerce;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> products = new ArrayList<>();
    private String customerName;
    private String shippingAddress;
    private double totalCost;
    private String status;

    public Order(String customerName, String shippingAddress) {
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
        this.status = "Pending";
    }

    public void addProduct(Product product) {
        products.add(product);
        totalCost += product.getPrice();
    }

    public void cancelOrder() {
        status = "Cancelled";
        System.out.println("Order cancelled successfully.");
    }

    public void updateOrderStatus(String newStatus) {
        status = newStatus;
        System.out.println("Order status updated to: " + newStatus);
    }
}
