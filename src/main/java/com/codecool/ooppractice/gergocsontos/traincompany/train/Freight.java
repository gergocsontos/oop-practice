package com.codecool.ooppractice.gergocsontos.traincompany.train;

import com.codecool.ooppractice.gergocsontos.traincompany.CargoType;

import java.time.Year;
import java.util.UUID;

public class Freight extends Train {
    static final double COST = 300.00;
    static final double BASE_REVENUE = 550.00;
    private CargoType cargo;

    public Freight(Year productionYear) {
        super(COST, productionYear);
    }

    @Override
    public double calculateMonthlyRevenue() {
        if (cargo != null) {
            return BASE_REVENUE + cargo.getPrice() - COST;
        } else {
            return - COST;
        }
    }

    public void setCargo(CargoType cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Freight{" +
                "cargo=" + cargo +
                ", cost=" + cost +
                ", serialNumber=" + serialNumber +
                ", productionYear=" + productionYear +
                '}';
    }

    public boolean isCargoDangerous() {
        if (cargo != null) {
            return cargo.equals(CargoType.DANGEROUS);
        } else {
            return false;
        }
    }
}
