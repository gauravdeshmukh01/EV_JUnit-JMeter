package org.example;

import org.example.Product;
import org.example.ShoppingCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    void testAddProductAndCount() {
        Product product = new Product("Book", 100.0, 2);
        cart.addProduct(product);
        assertEquals(1, cart.getProductCount());
        assertTrue(cart.getProducts().contains(product));
    }

    @Test
    void testGetTotalPriceMultipleProducts() {
        Product p1 = new Product("Pen", 10.0, 5);
        Product p2 = new Product("Notebook", 50.0, 2);
        cart.addProduct(p1);
        cart.addProduct(p2);
        assertEquals(150.0, cart.getTotalPrice());
    }

    @Test
    void testEmptyCart() {
        assertEquals(0, cart.getProductCount());
        assertEquals(0.0, cart.getTotalPrice());
    }

    @Test
    void testZeroPriceAndQuantityProduct() {
        double beforeTotal = cart.getTotalPrice();
        int beforeCount = cart.getProductCount();

        cart.addProduct(new Product("Freebie", 0.0, 0));

        assertEquals(beforeTotal, cart.getTotalPrice(), 0.0001);
        assertEquals(beforeCount, cart.getProductCount());
    }


    @Test
    void testAddNullProductThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> cart.addProduct(null));
        assertEquals("Product cannot be null", exception.getMessage());
   }
}