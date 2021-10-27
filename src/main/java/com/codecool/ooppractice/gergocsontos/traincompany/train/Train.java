package com.codecool.ooppractice.gergocsontos.traincompany.train;

import java.time.Year;
import java.util.UUID;

public abstract class Train {
    protected final double cost;
    protected final UUID serialNumber;
    protected final Year productionYear;

    public Train(double cost, Year productionYear) {
        this.cost = cost;
        this.serialNumber = UUID.randomUUID();
        this.productionYear = productionYear;
    }

    public abstract double calculateMonthlyRevenue();

    public double getCost() {
        return cost;
    }
}
