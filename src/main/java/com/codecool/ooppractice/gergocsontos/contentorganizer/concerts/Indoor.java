package com.codecool.ooppractice.gergocsontos.contentorganizer.concerts;

import com.codecool.ooppractice.gergocsontos.contentorganizer.bands.Band;

public class Indoor extends Concert {
    public static final int CAPACITY = 3000;
    public static final int DURATION = 90;
    public static final int BEER_PRICE = 600;

    public Indoor(Band mainBand, int ticketPrice) {
        super(mainBand, ticketPrice, CAPACITY, DURATION, BEER_PRICE);
    }

    @Override
    public String toString() {
        return "Indoor{" +
                "mainBand=" + mainBand +
                ", warmupBand=" + warmupBand +
                ", capacity=" + CAPACITY +
                ", duration=" + DURATION +
                ", ticketPrice=" + ticketPrice +
                ", ticketCounter=" + ticketCounter +
                ", beerPrice=" + BEER_PRICE +
                ", beerCounter=" + beerCounter +
                '}';
    }
}
