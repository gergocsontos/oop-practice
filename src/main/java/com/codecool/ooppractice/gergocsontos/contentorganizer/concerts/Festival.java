package com.codecool.ooppractice.gergocsontos.contentorganizer.concerts;

import com.codecool.ooppractice.gergocsontos.contentorganizer.bands.Band;

public class Festival extends Concert {

    static final int capacity = 8000;
    static final int duration = 360;
    static final int beerPrice = 1000;

    public Festival(Band mainBand, int ticketPrice) {
        super(mainBand, ticketPrice);
        super.capacity = capacity;
        super.duration = duration;
        super.beerPrice = beerPrice;
    }
}
