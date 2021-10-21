package com.codecool.ooppractice.gergocsontos.starfleet.spacecrafts;

import java.util.UUID;

public abstract class SpaceCraft {
    private final UUID registrationCode;
    private final int year;
    private String name;
    private ShipType type;

    public SpaceCraft(UUID registrationCode, int year, String name, ShipType type) {
        this.registrationCode = registrationCode;
        this.year = year;
        this.name = name;
        this.type = type;
    }

    public ShipType getType() {
        return type;
    }
}
