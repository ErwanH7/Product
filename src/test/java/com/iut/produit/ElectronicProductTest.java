package com.iut.produit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ElectronicProductTest {

    private static final double DELTA = 0.001;

    @Test
    void testGetBrand() {
        ElectronicProduct laptop = new ElectronicProduct("Laptop", 800.0, "HP");
        assertEquals("HP", laptop.getBrand());
    }

    @Test
    void calculatePriceDoublesCostAndAddsFixedFee() {
        ElectronicProduct laptop = new ElectronicProduct("Laptop", 800.0, "HP");
        assertEquals(800.0 * 2 + 4950.0, laptop.calculatePrice(), DELTA);
    }

    @Test
    void calculatePriceOfFreeProductIsFixedFee() {
        ElectronicProduct cable = new ElectronicProduct("Cable", 0.0, "Generic");
        assertEquals(4950.0, cable.calculatePrice(), DELTA);
    }
}