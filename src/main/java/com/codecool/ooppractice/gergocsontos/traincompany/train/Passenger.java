package com.codecool.ooppractice.gergocsontos.traincompany.train;

import java.time.Year;

public class Passenger extends PersonTransport {
    static final double COST = 1000.00;

    public Passenger(Year productionYear, int coaches) {
        super(COST, productionYear, coaches);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "cost=" + this.getCost() +
                ", coaches=" + coaches +
                ", ticketPrice=" + ticketPrice +
                ", serialNumber=" + serialNumber +
                ", productionYear=" + productionYear +
                '}';
    }
}
