package com.iut.produit;

class ElectronicProduct extends AbstractProduct {
    private String Elbrand;

    protected ElectronicProduct(String name, double cost, String brand) {
        super(name, cost);
        this.Elbrand = brand;
    }

    public String getBrand() {
        return Elbrand;
    }

    static final double MARKUP = 2.0;
    /** Frais fixes : 0 + 1 + ... + 99 = 4950 (valeur que calculait l'ancienne boucle). */
    static final double FIXED_FEE = 4950.0;

    @Override
    public double calculatePrice() {
        return getCost() * MARKUP + FIXED_FEE;
    }
}
