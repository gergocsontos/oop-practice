package com.codecool.ooppractice.gergocsontos.billiardsaloon;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Table {
    protected LocalTime reservationStart;
    private final List<Consumable> consumables = new ArrayList<>();
    private final TableType type;

    public Table(LocalTime reservationStart, TableType type) {
        this.reservationStart = reservationStart;
        this.type = type;
    }

    public void buyConsumable(Consumable consumable) {
        consumables.add(consumable);
    }

    public void payConsumable(Consumable consumable) {
        Optional<Consumable> removedConsumable = consumables.stream().filter(x -> x.equals(consumable)).findFirst();
        removedConsumable.ifPresent(consumables::remove);
    }

    public int getSumOfConsumables() {
        return consumables.stream().map(Consumable::getPrice).reduce(0, Integer::sum);
    }

    public void setReservationStart(LocalTime start) {
        reservationStart = start;
        System.out.println("Reservation successful!");
    }

    private int tablePriceCalculation() {
        if (reservationStart != null) {
            int startHour = reservationStart.getHour();
            int endHour = LocalTime.now().getHour();
            int occupiedHours = endHour - startHour + 1;
            return occupiedHours * type.getPrice();
        }
        return 0;
    }

    public int totalPriceCalculation() {
        return tablePriceCalculation() + getSumOfConsumables();
    }

    public TableType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Table{" +
                "reservationStart=" + reservationStart +
                ", consumables=" + consumables +
                ", type=" + type +
                '}';
    }
}
