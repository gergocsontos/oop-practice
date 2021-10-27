package com.codecool.ooppractice.gergocsontos.traincompany.train;

import java.time.Year;

public abstract class PersonTransport extends Train {
    static final int PEOPLE_PER_DAY = 50;
    static final double BASE_TICKET_PRICE = 1.50;
    protected double cost;
    protected int coaches;
    protected double ticketPrice;

    public PersonTransport(double cost, Year productionYear, int coaches) {
        super(cost, productionYear);
        this.coaches = coaches;
        ticketPrice = BASE_TICKET_PRICE;
    }

    @Override
    public double calculateMonthlyRevenue() {
        return (30 * coaches * ticketPrice * 0.75 * PEOPLE_PER_DAY +
                30 * coaches * (ticketPrice + 2) * 0.25 * PEOPLE_PER_DAY) - this.getCost();
    }

    public void setCoaches(int coaches) {
        this.coaches = coaches;
    }
}
