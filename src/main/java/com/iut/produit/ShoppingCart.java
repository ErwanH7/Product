package com.iut.produit;
import java.util.*;

class ShoppingCart {
    private final List<AbstractProduct> items = new ArrayList<>();

    public void addItem(AbstractProduct item) {
        if (item == null) {
            throw new IllegalArgumentException("Impossible d'ajouter un produit null");
        }
        items.add(item);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (AbstractProduct item : items) {
            totalPrice += item.calculatePrice();
        }
        return totalPrice;
    }
}
