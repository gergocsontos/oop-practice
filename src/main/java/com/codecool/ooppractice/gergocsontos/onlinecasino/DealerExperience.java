package com.codecool.ooppractice.gergocsontos.onlinecasino;

import java.math.BigDecimal;

public enum DealerExperience {
    NEWBIE (1, new BigDecimal("50000")),
    MID_LEVEL (2, new BigDecimal("80000")),
    PRO (3, new BigDecimal("120000"));
    private final int level;
    private final BigDecimal salary;

    DealerExperience(int level, BigDecimal salary) {
        this.level = level;
        this.salary = salary;
    }

    public int getLevel() {
        return level;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
