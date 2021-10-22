package com.codecool.ooppractice.gergocsontos.contentorganizer.concerts;

import com.codecool.ooppractice.gergocsontos.contentorganizer.bands.Band;

public class Outdoor extends Concert {

    static final int capacity = 5000;
    static final int duration = 120;
    static final int beerPrice = 800;

    private boolean isCancelled = false;

    public Outdoor(Band mainBand, int ticketPrice) {
        super(mainBand, ticketPrice);
        super.capacity = capacity;
        super.duration = duration;
        super.beerPrice = beerPrice;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
}
