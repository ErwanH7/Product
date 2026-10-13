package com.iut.produit;

/**
 * Produit concret minimal, utilisé uniquement pour tester AbstractProduct.
 */
class ConcreteProduct extends AbstractProduct {

    ConcreteProduct(String name, double cost) {
        super(name, cost);
    }
}
