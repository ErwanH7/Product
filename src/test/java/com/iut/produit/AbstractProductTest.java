package com.iut.produit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AbstractProductTest {

    @Test
    public void testGetCost() {
        AbstractProduct product = new ConcreteProduct("Test Product", 50.0);
        assertEquals(50.0, product.getCost(), 0.001); // Utilisation de 0.001 comme marge d'erreur pour les doubles
    }

    @Test
    void calculatePriceReturnsCostByDefault() {
        AbstractProduct product = new ConcreteProduct("Test Product", 50.0);
        assertEquals(50.0, product.calculatePrice(), 0.001);
    }

    @Test
    void testGetName() {
        AbstractProduct product = new ConcreteProduct("Test Product", 50.0);
        assertEquals("Test Product", product.getName());
    }

    @Test
    void constructorRejectsNegativeCost() {
        assertThrows(IllegalArgumentException.class, () -> new ConcreteProduct("Test Product", -1.0));
    }

    @Test
    void constructorRejectsNullName() {
        assertThrows(IllegalArgumentException.class, () -> new ConcreteProduct(null, 50.0));
    }

    @Test
    void constructorRejectsBlankName() {
        assertThrows(IllegalArgumentException.class, () -> new ConcreteProduct("  ", 50.0));
    }
}
