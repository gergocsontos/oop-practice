package com.codecool.ooppractice.gergocsontos.starfleet.spacecrafts;

import com.codecool.ooppractice.gergocsontos.starfleet.Fleet;

import java.time.LocalDateTime;
import java.util.UUID;

public class DiscoveryShip extends MobileShip {

    public DiscoveryShip(UUID registrationCode, int year, String name, ShipType type, Fleet fleet) {
        super(registrationCode, year, name, type, fleet);
    }

    @Override
    public void dock(SpaceStation station) {
        System.out.println("I AM DOCKING! Time of Docking: " + LocalDateTime.now() +
                            " , Space Station Registration Code: " + station.getRegistrationCode());
    }

    @Override
    public String toString() {
        return "DiscoveryShip{" +
                "speed=" + speed +
                ", registrationCode=" + registrationCode +
                ", year=" + year +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
