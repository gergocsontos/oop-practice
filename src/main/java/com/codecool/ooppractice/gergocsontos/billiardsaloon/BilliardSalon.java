package com.codecool.ooppractice.gergocsontos.billiardsaloon;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BilliardSalon {
    private final Set<Table> tables = new HashSet<>();

    public Set<Table> getAllTablesByType(TableType type) {
        return tables.stream().filter(table -> table.getType().equals(type)).collect(Collectors.toSet());
    }

    public Table getHighestConsumption() {
        return tables.stream().max(Comparator.comparing(Table::totalPriceCalculation)).get();
    }

    public void addTable(Table table) {
        tables.add(table);
    }
}
