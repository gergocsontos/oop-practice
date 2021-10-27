package com.codecool.ooppractice.gergocsontos.traincompany;

public enum CargoType {
    NORMAL(0.00),
    NON_SOLID(150.00),
    DANGEROUS(300.00);
    private final double price;

    CargoType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
