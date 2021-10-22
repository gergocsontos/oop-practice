package com.codecool.ooppractice.gergocsontos.starfleet.spacecrafts;

import com.codecool.ooppractice.gergocsontos.starfleet.Fleet;

import java.util.UUID;

public abstract class SpaceCraft {
    protected final UUID registrationCode;
    protected final int year;
    protected String name;
    protected ShipType type;
    protected Fleet fleet;

    public SpaceCraft(UUID registrationCode, int year, String name, ShipType type, Fleet fleet) {
        this.registrationCode = registrationCode;
        this.year = year;
        this.name = name;
        this.type = type;
        this.fleet = fleet;
        this.fleet.addShip(this);
    }

    public ShipType getType() {
        return type;
    }

    public UUID getRegistrationCode() {
        return registrationCode;
    }

    @Override
    public abstract String toString();
}
