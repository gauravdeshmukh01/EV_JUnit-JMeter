package org.example;


import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        if (product == null) throw new IllegalArgumentException("Product cannot be null");
        if (product.getPrice() == 0.0 && product.getQuantity() == 0) return;
        products.add(product);
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Product p : products) total += p.getTotalPrice();
        return total;
    }

    public int getProductCount() { return products.size(); }
    public List<Product> getProducts() { return products; }
}
