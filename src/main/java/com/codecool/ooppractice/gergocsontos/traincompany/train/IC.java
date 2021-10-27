package com.codecool.ooppractice.gergocsontos.traincompany.train;

import java.time.Year;

public class IC extends PersonTransport {
    static final double IC_EXTRA_FEE = 0.50;
    static final int MAX_COACHES = 10;
    static final double COST = 1200.00;

    public IC(Year productionYear, int coaches) {
        super(COST, productionYear, coaches);
        setCoaches(coaches);
        ticketPrice += IC_EXTRA_FEE;
    }

    @Override
    public void setCoaches(int coaches) {
        if (coaches <= MAX_COACHES) {
            super.setCoaches(coaches);
        } else {
            throw new RuntimeException("Too many coaches for that IC!");
        }
    }

    @Override
    public String toString() {
        return "IC{" +
                "cost=" + this.getCost() +
                ", coaches=" + coaches +
                ", ticketPrice=" + ticketPrice +
                ", serialNumber=" + serialNumber +
                ", productionYear=" + productionYear +
                '}';
    }
}
