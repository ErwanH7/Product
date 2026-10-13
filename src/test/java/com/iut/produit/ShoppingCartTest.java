package com.iut.produit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ShoppingCartTest {

    private static final double DELTA = 0.001;

    @Test
    void emptyCartCostsNothing() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0.0, cart.calculateTotalPrice(), DELTA);
    }

    @Test
    void totalIsSumOfProductPrices() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new ConcreteProduct("Livre", 20.0));
        cart.addItem(new ElectronicProduct("Laptop", 800.0, "HP"));
        assertEquals(20.0 + 6550.0, cart.calculateTotalPrice(), DELTA);
    }

    @Test
    void addItemRejectsNull() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> cart.addItem(null));
    }
}