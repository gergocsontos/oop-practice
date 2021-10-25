package com.codecool.ooppractice.gergocsontos.Formula1;

import java.util.Set;

public class Car {
    private CarParts parts;
    private Set<CarParts> teamParts;

    public void setTeamParts(Set<CarParts> teamParts) {
        this.teamParts = teamParts;
    }

    public Set<CarParts> getTeamParts() {
        return teamParts;
    }

    public CarParts getParts() {
        return parts;
    }

    public void setParts(CarParts parts) {
        this.parts = parts;
    }

    @Override
    public String toString() {
        return "Car{" +
                "parts=" + parts +
                ", teamParts=" + teamParts +
                '}';
    }
}
