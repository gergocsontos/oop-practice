package com.codecool.ooppractice.gergocsontos.billiardsaloon;

import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my Billiard Salon!");
        BilliardSalon salon = new BilliardSalon();
        // filling the salon with all the tables, no reservations yet
        Table rex = new RestrictedTable(null, TableType.REX);
        Table pool = new Table(null, TableType.POOL);
        Table snooker = new RestrictedTable(null, TableType.SNOOKER);
        salon.addTable(pool);
        salon.addTable(rex);
        salon.addTable(snooker);
        // add new Rex Table for the final list
        salon.addTable(new RestrictedTable(LocalTime.of(19, 30), TableType.REX));
        // adding reservations
        rex.setReservationStart(LocalTime.of(19, 0));
        pool.setReservationStart(LocalTime.of(6, 0));
        snooker.setReservationStart(LocalTime.now());

        // adding different consumables
        Consumable ropi1 = new Consumable(200, ConsumableType.FOOD, "Crackers");
        // Consumable ropi2 = new Consumable(200, ConsumableType.FOOD, "Ropi");
        Consumable vodka1 = new Consumable(1200, ConsumableType.BEVERAGE, "Pepsi");
        Consumable vodka2 = new Consumable(1200, ConsumableType.BEVERAGE, "Pepsi");

        pool.buyConsumable(ropi1);
        pool.buyConsumable(vodka1);

        rex.buyConsumable(vodka2);

        System.out.println("Sum of consumables at Pool Table: " + pool.getSumOfConsumables());
        System.out.println("Total price at Pool Table (from 6am): " + pool.totalPriceCalculation());


        System.out.println("Highest consumption: " + salon.getHighestConsumption());

        rex.payConsumable(vodka2);

        System.out.println("All Rex Tables: " + Arrays.toString(salon.getAllTablesByType(TableType.REX).toArray()));
    }

}
