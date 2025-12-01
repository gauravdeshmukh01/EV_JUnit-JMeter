package org.example.shop;


public class Product {
    private final String name;
    private final double price;
    private final int quantity;

    public Product(String name, double price, int quantity) {
        // Validation for exam requirements (exception on negative values)
        if (price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Price and quantity must be non-negative");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() { return price * quantity; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
}
