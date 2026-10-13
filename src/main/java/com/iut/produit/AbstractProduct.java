package com.iut.produit;

abstract class AbstractProduct {

    private final String name;
    private final double cost;

    protected AbstractProduct(String name, double cost) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Le nom du produit est obligatoire");
        }
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

