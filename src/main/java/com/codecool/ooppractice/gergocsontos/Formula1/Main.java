package com.codecool.ooppractice.gergocsontos.Formula1;

import com.codecool.ooppractice.gergocsontos.Formula1.employees.CrewMember;
import com.codecool.ooppractice.gergocsontos.Formula1.employees.Driver;
import com.codecool.ooppractice.gergocsontos.Formula1.employees.Engineer;
import com.codecool.ooppractice.gergocsontos.Formula1.employees.Experience;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello F1!");
        Team team = new Team(10000000);

        team.addEmployee(new Engineer("Jack", 33));
        team.addEmployee(new Engineer("Jack2", 33));
        team.addEmployee(new CrewMember("Jack3", 33));
        team.addEmployee(new CrewMember("Jack4", 33));
        team.addEmployee(new CrewMember("Jack5", 33));
        team.addEmployee(new CrewMember("Jack6", 33));
        team.addEmployee(new Driver("Jack7", 33, Experience.INTERMEDIATE));
        team.addEmployee(new Driver("Jack8", 33, Experience.MEDIUM));
        team.addEmployee(new Driver("Jack9", 33, Experience.BEGINNER));

        CarParts parts1 = new CarParts();
        CarParts parts2 = new CarParts();
        team.buyCarParts(parts1);
        team.buyCarParts(parts2);

        Car car1 = new Car();
        Car car2 = new Car();
        team.addCar(car1);
        team.addCar(car2);

        parts1.setCar(car2);
        parts2.setCar(car1);

        System.out.printf("All car parts that the car knows about: %s\n", car1.getTeamParts());

        team.simulateSeason(22, 8);

        System.out.printf("Total Money after the season: %s\n",team.getTotalMoney());
        System.out.printf("Share for one mentor: %f", team.calculateMentorsShare(10, 0.2));
    }
}
