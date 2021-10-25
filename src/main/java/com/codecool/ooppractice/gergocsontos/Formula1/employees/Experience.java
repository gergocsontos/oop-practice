package com.codecool.ooppractice.gergocsontos.Formula1.employees;

public enum Experience {
    BEGINNER(20000),
    MEDIUM(40000),
    INTERMEDIATE(100000);
    private final int salary;

    Experience(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
