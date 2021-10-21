package com.codecool.ooppractice.gergocsontos.starfleet.spacecrafts;

public enum ShipType {
    SPACE_STATION(0),
    CARGO_SHIP(150),
    DISCOVERY_SHIP(450);
    private final int maxSpeed;

    ShipType(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
