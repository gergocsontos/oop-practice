package com.codecool.ooppractice.gergocsontos.traincompany;

import com.codecool.ooppractice.gergocsontos.traincompany.train.*;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Train Company!");
        TrainCompany trainCompany = new TrainCompany();
        trainCompany.addTrain(new Freight(Year.of(2007)));
        trainCompany.addTrain(new IC(Year.of(2020), 10));
        trainCompany.addTrain(new Passenger(Year.of(1999), 12));
        IC ic = new IC(Year.of(2020), 9);
        trainCompany.addTrain(ic);
        Passenger passenger = new Passenger(Year.of(2000), 30);
        Freight freight = new Freight(Year.of(1800));
        Freight freight2 = new Freight(Year.of(1810));
        Freight freight3 = new Freight(Year.of(1830));
        freight2.setCargo(CargoType.NORMAL);
        freight3.setCargo(CargoType.NON_SOLID);
        freight.setCargo(CargoType.DANGEROUS);
        trainCompany.addTrain(freight);
        trainCompany.addTrain(freight2);
        trainCompany.addTrain(freight3);
        System.out.println(freight.calculateMonthlyRevenue());
        trainCompany.addTrain(passenger);
        System.out.println(trainCompany.getTrains());
        System.out.println(trainCompany.calculateTotalMonthlyRevenue());

        System.out.println(trainCompany.listFrightsWithDangerousCargo());
    }
}
