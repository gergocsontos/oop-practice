package com.codecool.ooppractice.gergocsontos.billiardsaloon.tables;

import com.codecool.ooppractice.gergocsontos.billiardsaloon.Consumable;
import com.codecool.ooppractice.gergocsontos.billiardsaloon.tables.TableType;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Table {
    protected LocalTime reservationStart;
    private final List<Consumable> consumables = new ArrayList<>();
    private final TableType type;

    public Table(TableType type) {
        if (! isValidTableType(type)) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Inappropriate Table Type!");
        }
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

    protected boolean isValidTableType(TableType type) {
        return type.isRestricted();
    }

    public TableType getType() {
        return type;
    }

    public LocalTime getReservationStart() {
        return reservationStart;
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
