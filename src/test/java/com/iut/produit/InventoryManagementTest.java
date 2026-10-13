package com.iut.produit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InventoryManagementTest {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private PrintStream originalOut;

    @BeforeEach
    void redirectSystemOut() {
        originalOut = System.out;
        System.setOut(new PrintStream(output));
    }

    @AfterEach
    void restoreSystemOut() {
        System.setOut(originalOut);
    }

    @Test
    void mainPrintsCartTotal() {
        InventoryManagement.main(new String[0]);
        // Laptop : 800 x 2 + 4950 = 6550 ; Smartphone : 500 x 2 + 4950 = 5950
        assertEquals("Total du panier : $12500.0" + System.lineSeparator(), output.toString());
    }
}