package ecommerce;
import java.util.ArrayList;

public class ShoppingCart
 {
    private ArrayList<Product> products = new ArrayList<>();

    public void showListOfProducts() {
        System.out.println("Name\tPrice");
        for (Product product : products) {
            System.out.println(product.getName() + "\t" + product.getPrice());
        }
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added to cart: " + product.getName());
    }

    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println("Product removed from cart: " + product.getName());
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Product product : products) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }
}
