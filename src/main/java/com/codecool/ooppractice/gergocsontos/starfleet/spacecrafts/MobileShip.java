package com.codecool.ooppractice.gergocsontos.starfleet.spacecrafts;

import com.codecool.ooppractice.gergocsontos.starfleet.Fleet;

import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public abstract class MobileShip extends SpaceCraft {
    protected final int speed;

    public MobileShip(UUID registrationCode, int year, String name, ShipType type, Fleet fleet) {
        super(registrationCode, year, name, type, fleet);
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
        return fleet.getShips().stream()
                .filter(ship -> ship instanceof SpaceStation)
                .map(ship -> (SpaceStation) ship)
                .filter(SpaceStation::hasAvailableDock)
                .collect(Collectors.toSet());
    }

    @Override
    public abstract String toString();

    public int getSpeed() {
        return speed;
    }
}
