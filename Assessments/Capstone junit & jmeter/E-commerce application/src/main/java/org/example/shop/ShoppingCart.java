package org.example.shop;


import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        if (product == null) throw new IllegalArgumentException("Product cannot be null");
        // Edge-case rule: price==0 AND quantity==0 should not affect total or count
        if (product.getPrice() == 0.0 && product.getQuantity() == 0) return; // ignore
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
