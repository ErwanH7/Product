package com.iut.produit;

abstract class AbstractProduct {

    private final String name;
    private final double cost;

    public AbstractProduct(String name, double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Le coût ne peut pas être négatif : " + cost);
        }
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public double calculatePrice() {
        return cost;
    }
}

