package com.codecool.ooppractice.gergocsontos.starfleet;

import com.codecool.ooppractice.gergocsontos.starfleet.spacecrafts.*;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello stars");
        Fleet fleet = new Fleet();
        DiscoveryShip discoverer = new DiscoveryShip(UUID.randomUUID(), 2130, "Fox", ShipType.DISCOVERY_SHIP, fleet);
        SpaceStation motherShip = new SpaceStation(UUID.randomUUID(), 2200, "BigDaddy", ShipType.SPACE_STATION, fleet);
        CargoShip cargoBoi = new CargoShip(UUID.randomUUID(), 2300, "Stacker", ShipType.CARGO_SHIP, fleet);
        CargoShip cargoBoi2 = new CargoShip(UUID.randomUUID(), 2300, "Stacker", ShipType.CARGO_SHIP, fleet);
        CargoShip cargoBoi3 = new CargoShip(UUID.randomUUID(), 2300, "Stacker", ShipType.CARGO_SHIP, fleet);

        System.out.println(cargoBoi);

        System.out.println(cargoBoi2.getAllStationsWithFreeDock());

        motherShip.placeMobileShipInDock(discoverer);
        motherShip.placeMobileShipInDock(cargoBoi);

        System.out.println(cargoBoi);
        System.out.println(discoverer);

        System.out.println(cargoBoi.getSpeed());
        System.out.println(discoverer.getSpeed());
    }
}
