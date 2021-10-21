package com.codecool.ooppractice.gergocsontos.starfleet;

import com.codecool.ooppractice.gergocsontos.starfleet.spacecrafts.DiscoveryShip;
import com.codecool.ooppractice.gergocsontos.starfleet.spacecrafts.ShipType;
import com.codecool.ooppractice.gergocsontos.starfleet.spacecrafts.SpaceCraft;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello stars");
        Fleet fleet = new Fleet();
        SpaceCraft discoverer = new DiscoveryShip(UUID.randomUUID(), 2130, "Fox", ShipType.DISCOVERY_SHIP);
        fleet.addShip(discoverer);
    }
}
