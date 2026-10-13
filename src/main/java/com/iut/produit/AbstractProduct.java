package com.iut.produit;

abstract  class AbstractProduct {

    private String Prname;
    private double Prcost;

    public AbstractProduct(String name, double cost) {
        this.Prname = name;
        this.Prcost = cost;
    }

    public double getCost() {
        return Prcost;
    }

    public double calculatePrice() {
        return Prcost;
    }

}
