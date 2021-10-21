package com.codecool.ooppractice.gergocsontos.billiardsaloon.tables;

public enum TableType {
    REX(800, true),
    POOL(1200, false),
    SNOOKER(1600, true);
    private final int price;
    private final boolean isRestricted;

    TableType(int price, boolean isRestricted) {
        this.price = price;
        this.isRestricted = isRestricted;
    }

    public int getPrice() {
        return price;
    }

    public boolean isRestricted() {
        return isRestricted;
    }
}
