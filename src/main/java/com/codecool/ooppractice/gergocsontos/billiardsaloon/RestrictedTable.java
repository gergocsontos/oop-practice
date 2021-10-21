package com.codecool.ooppractice.gergocsontos.billiardsaloon;

import java.time.LocalTime;

public class RestrictedTable extends Table{
    private static final LocalTime MIN_TIME = LocalTime.of(18, 0);

    public RestrictedTable(LocalTime reservationStart, TableType type) {

        super(reservationStart, type);

    }

    @Override
    public void setReservationStart(LocalTime start) {

        if (start.isBefore(MIN_TIME)) {
            reservationStart = start;
            System.out.println("Reservation successful!");
        } else {
            System.out.println("Unsuccessful reservation!");
        }
    }
}
