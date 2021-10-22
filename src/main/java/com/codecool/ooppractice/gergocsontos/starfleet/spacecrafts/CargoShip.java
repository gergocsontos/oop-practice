package com.codecool.ooppractice.gergocsontos.starfleet.spacecrafts;

import com.codecool.ooppractice.gergocsontos.starfleet.Cargo;
import com.codecool.ooppractice.gergocsontos.starfleet.Fleet;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class CargoShip extends MobileShip {

    private static final int MAX_CARGO = 5;
    private Map<Cargo, Integer> shipment;

    public CargoShip(UUID registrationCode, int year, String name, ShipType type, Fleet fleet) {
        super(registrationCode, year, name, type, fleet);
        shipment = generateCargo();
    }

    @Override
    public void dock(SpaceStation station) {
        System.out.println("I AM DOCKING! Registration Code: " + registrationCode +
                            " ,Shipment: " + shipment);
        shipment = generateCargo();
    }

    public Map<Cargo, Integer> generateCargo() {
        Map<Cargo, Integer> shipment = new HashMap<>();
        Random random = new Random();

        for (Cargo cargo : Cargo.values()) {
            shipment.put(cargo, random.nextInt(MAX_CARGO + 1));
        }
        return shipment;
    }

    @Override
    public String toString() {
        return "CargoShip{" +
                "shipment=" + shipment +
                ", speed=" + speed +
                ", registrationCode=" + registrationCode +
                ", year=" + year +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
