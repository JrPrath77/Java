package ecommerce;

import java.util.ArrayList;

public class Product {
    private String name;
    private int price;
    private static ArrayList<Product> productList = new ArrayList<>();

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        productList.add(this); // Add the new product to the productList
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static void showProducts() {
        for (Product product : productList) {
          System.out.println(product.getName() + " price " + product.getPrice());
        }
      }

    public void updateProductDetails(int newPrice) {
        this.price = newPrice;
        System.out.println("Product details updated successfully.");
    }
}
