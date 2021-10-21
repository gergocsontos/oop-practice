package com.codecool.ooppractice.gergocsontos.billiardsaloon;

public class Consumable {
    private final int price;
    private final ConsumableType type;
    private final String name;

    public Consumable(int price, ConsumableType type, String name) {
        this.price = price;
        this.type = type;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Consumable{" +
                "price=" + price +
                ", type=" + type +
                ", name='" + name + '\'' +
                '}';
    }
}
