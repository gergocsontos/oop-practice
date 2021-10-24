package com.codecool.ooppractice.gergocsontos.contentorganizer.concerts;

import com.codecool.ooppractice.gergocsontos.contentorganizer.bands.Band;

public class Festival extends Concert {

    static final int CAPACITY = 8000;
    static final int DURATION = 360;
    static final int BEER_PRICE = 1000;

    public Festival(Band mainBand, int ticketPrice) {
        super(mainBand, ticketPrice, CAPACITY, DURATION, BEER_PRICE);
    }
}