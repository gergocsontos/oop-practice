package com.codecool.ooppractice.gergocsontos.Formula1;

import com.codecool.ooppractice.gergocsontos.Formula1.employees.Employee;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Team {
    public static final int WINNING = 10000000;

    private final Set<Car> cars = new HashSet<>();
    private final Set<Employee> employees = new HashSet<>();
    private final Set<CarParts> carParts = new HashSet<>();
    private int totalMoney;

    public Team(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public void addCar(Car car) {
        cars.add(car);
        car.setTeamParts(carParts);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void buyCarParts(CarParts parts) {

        int partsCost = parts.getPrice();
        if (totalMoney >= partsCost) {
            totalMoney -= parts.getPrice();
            parts.setOwned(true);
            carParts.add(parts);
        } else {
            throw new RuntimeException("Not enough money to buy new parts!");
        }
    }

    public void simulateSeason(int allRaces, int wonRaces) {
        totalMoney += calculateWinnings(wonRaces);
        for (int i = 0; i < allRaces; i++) {
            race();
        }
    }

    public void race() {
        for (Car car : cars) {
            carParts.remove(car.getParts());
            car.setParts(null);
            buyCarParts(new CarParts());
        }
        totalMoney -= calculateSalariesForTeam();
    }

    public int calculateSalariesForTeam() {
        Optional<Integer> sum = employees.stream().map(Employee::getSalary).reduce(Integer::sum);
        return sum.orElse(0);
    }

    public int calculateWinnings(int wonRaces) {
        return wonRaces * WINNING;
    }

    public double calculateMentorsShare(int mentors, double percentage) {
        return totalMoney * percentage / mentors;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public Set<CarParts> getCarParts() {
        return carParts;
    }

    public int getTotalMoney() {
        return totalMoney;
    }
}
