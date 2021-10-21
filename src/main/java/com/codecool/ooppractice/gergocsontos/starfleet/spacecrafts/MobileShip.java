package com.codecool.ooppractice.gergocsontos.starfleet.spacecrafts;

import java.util.Set;
import java.util.UUID;

public abstract class MobileShip extends SpaceCraft {
    private final int speed;

    public MobileShip(UUID registrationCode, int year, String name, ShipType type) {
        super(registrationCode, year, name, type);
        speed = calculateSpeedFromYear(year, type);

    }

    public int calculateSpeedFromYear(int year, ShipType type) {
        if (year < 2150) {
            return type.getMaxSpeed() - 30;
        } else if (year > 2200) {
            return type.getMaxSpeed() + 15;
        } else {
            return type.getMaxSpeed();
        }
    }

    public abstract void dock(SpaceStation station);

    public Set<SpaceStation> getAllStationsWithFreeDock() {
        //TODO: getAllStationsWithFreeDock()
        return null;
    }
}
