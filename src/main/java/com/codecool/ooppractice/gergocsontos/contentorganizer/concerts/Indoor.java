package com.codecool.ooppractice.gergocsontos.contentorganizer.concerts;

import com.codecool.ooppractice.gergocsontos.contentorganizer.bands.Band;

public class Indoor extends Concert {
    public static final int capacity = 3000;
    public static final int duration = 90;
    public static final int beerPrice = 600;

    public Indoor(Band mainBand, int ticketPrice) {
        super(mainBand, ticketPrice);
        super.capacity = capacity;
        super.duration = duration;
        super.beerPrice = beerPrice;


    }

    @Override
    public String toString() {
        return "Indoor{" +
                "mainBand=" + mainBand +
                ", warmupBand=" + warmupBand +
                ", capacity=" + capacity +
                ", duration=" + duration +
                ", ticketPrice=" + ticketPrice +
                ", ticketCounter=" + ticketCounter +
                ", beerPrice=" + beerPrice +
                ", beerCounter=" + beerCounter +
                '}';
    }
}
