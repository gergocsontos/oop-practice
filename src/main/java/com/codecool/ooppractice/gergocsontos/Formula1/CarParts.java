package com.codecool.ooppractice.gergocsontos.Formula1;

public class CarParts {
    final static int PRICE = 10000;
    private int price;
    private boolean owned;
    private Car car;

    public CarParts() {
        this.price = PRICE;
    }

    public int getPrice() {
        return price;
    }

    public void setCar(Car car) {
        if (owned) {
            this.car = car;
            car.setParts(this);
        } else {
            throw new RuntimeException("You need to buy the parts first!");
        }
    }

    public void setOwned(boolean owned) {
        this.owned = owned;
    }

    @Override
    public String toString() {
        return "CarParts{" +
                "price=" + price +
                ", owned=" + owned +
                '}';
    }
}
