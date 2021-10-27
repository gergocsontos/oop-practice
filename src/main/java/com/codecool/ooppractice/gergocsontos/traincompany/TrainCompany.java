package com.codecool.ooppractice.gergocsontos.traincompany;

import com.codecool.ooppractice.gergocsontos.traincompany.train.Freight;
import com.codecool.ooppractice.gergocsontos.traincompany.train.Train;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TrainCompany {
    Set<Train> trains = new HashSet<>();

    public Set<Train> getTrains() {
        return trains;
    }

    public void addTrain (Train train) {
        trains.add(train);
    }

    public double calculateTotalMonthlyRevenue() {
        Optional<Double> sum = trains.stream().map(Train::calculateMonthlyRevenue).reduce(Double::sum);
        return sum.orElse(0.0);
    }

    public List<Freight> listFrightsWithDangerousCargo() {
        return trains.stream()
                .filter(x -> x instanceof Freight)
                .map(x -> (Freight) x)
                .filter(Freight::isCargoDangerous)
                .collect(Collectors.toList());
    }
}
