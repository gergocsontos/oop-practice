package com.codecool.ooppractice.gergocsontos.starfleet.spacecrafts;

import java.util.UUID;

public class CargoShip extends MobileShip {

    private static final int MAX_SPEED = 150;

    public CargoShip(UUID registrationCode, int year, String name, ShipType type) {
        super(registrationCode, year, name, type);
    }

    @Override
    public void dock(SpaceStation station) {

    }
}
