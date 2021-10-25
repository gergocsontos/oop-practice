package com.codecool.ooppractice.gergocsontos.onlinecasino;

public class Dealer {
    private final String name;
    private DealerExperience experience;

    public Dealer(String name, DealerExperience experience) {
        this.name = name;
        this.experience = experience;
    }

    public DealerExperience getExperience() {
        return experience;
    }
}
