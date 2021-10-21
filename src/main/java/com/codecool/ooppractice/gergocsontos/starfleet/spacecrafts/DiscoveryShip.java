package com.codecool.ooppractice.gergocsontos.starfleet.spacecrafts;

import java.util.UUID;

public class DiscoveryShip extends MobileShip {

    private static final int MAX_SPEED = 450;

    public DiscoveryShip(UUID registrationCode, int year, String name, ShipType type) {
        super(registrationCode, year, name, type);
    }

    @Override
    public void dock(SpaceStation station) {

    }
}
