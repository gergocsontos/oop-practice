package com.codecool.ooppractice.gergocsontos.billiardsaloon.tables;

import java.time.LocalTime;

public class RestrictedTable extends Table {
    private static final LocalTime MIN_TIME = LocalTime.of(18, 0);

    public RestrictedTable(TableType type) {

        super(type);

    }

    @Override
    public void setReservationStart(LocalTime start) {

        if (start.isBefore(MIN_TIME)) {
            System.out.println("Unsuccessful reservation!");
        } else {
            reservationStart = start;
            System.out.println("Reservation successful!");
        }
    }

    @Override
    protected boolean isValidTableType(TableType type) {
        return !type.isRestricted();
    }
}
