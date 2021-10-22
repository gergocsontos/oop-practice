package com.codecool.ooppractice.gergocsontos.starfleet;

import com.codecool.ooppractice.gergocsontos.starfleet.spacecrafts.SpaceCraft;

import java.util.HashSet;
import java.util.Set;

public class Fleet {
    private final Set<SpaceCraft> ships = new HashSet<>();

    public void addShip(SpaceCraft ship) {
        ships.add(ship);
    }

    public Set<SpaceCraft> getShips() {
        return ships;
    }
}
