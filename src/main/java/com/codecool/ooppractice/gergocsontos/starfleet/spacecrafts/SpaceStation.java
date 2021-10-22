package com.codecool.ooppractice.gergocsontos.starfleet.spacecrafts;

import com.codecool.ooppractice.gergocsontos.starfleet.Fleet;

import java.util.*;
import java.util.stream.Collectors;

public class SpaceStation extends SpaceCraft {
    private final MobileShip[] docks = new MobileShip[2];

    public SpaceStation(UUID registrationCode, int year, String name, ShipType type, Fleet fleet) {
        super(registrationCode, year, name, type, fleet);
    }

    public MobileShip[] getDocks() {
        return docks;
    }

    public boolean hasAvailableDock() {
        return Arrays.stream(docks).anyMatch(Objects::isNull);
    }

    public void placeMobileShipInDock(MobileShip mobileShip) {
        for (int i = 0; i < docks.length; i++) {
            if (docks[i] == null) {
                docks[i] = mobileShip;
                mobileShip.dock(this);
                break;
            }
        }
    }

    public List<SpaceCraft> generateListOfSpaceCrafts(ShipType type) {
        return fleet.getShips().stream()
                .filter(ship -> ship.getType().equals(type))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "SpaceStation{" +
                "registrationCode=" + registrationCode +
                ", year=" + year +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", docks=" + Arrays.toString(docks) +
                '}';
    }


}
