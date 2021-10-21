package com.codecool.ooppractice.gergocsontos.billiardsaloon;

public enum TableType {
    REX(800),
    POOL(1200),
    SNOOKER(1600);
    private final int price;

    TableType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
