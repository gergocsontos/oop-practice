package com.codecool.ooppractice.gergocsontos.Formula1.employees;

public class Driver extends Employee {
    private Experience experience;

    public Driver(String name, int age, Experience experience) {
        super(name, age, experience.getSalary());
    }
}
