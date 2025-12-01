package org.example;


import org.example.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ProductTest {

    @Test
    void testGetTotalPrice() {
        Product product = new Product("laptop", 1000.0, 2);
        assertEquals(2000.0, product.getTotalPrice());
    }

    @Test
    void testNegativePriceThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new Product("Iphone", -1000.0, 1));
        assertEquals("Price and quantity must be non-negative", exception.getMessage());
    }

    @Test
    void testNegativeQuantityThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new Product("tablet", 500.0, -3));
        assertEquals("Price and quantity must be non-negative", exception.getMessage());
    }
}
