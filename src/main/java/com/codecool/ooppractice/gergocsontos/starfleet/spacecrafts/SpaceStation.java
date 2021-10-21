package com.codecool.ooppractice.gergocsontos.starfleet.spacecrafts;

import java.util.UUID;

public class SpaceStation extends SpaceCraft {
    private final MobileShip[] docks = new MobileShip[2];

    public SpaceStation(UUID registrationCode, int year, String name, ShipType type) {
        super(registrationCode, year, name, type);
    }

    // TODO: GenerateListOfSpaceCrafts()
}
