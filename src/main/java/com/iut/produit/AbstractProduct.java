package com.iut.produit;

abstract class AbstractProduct {

    private final String name;
    private final double cost;

    public AbstractProduct(String name, double cost) {
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
