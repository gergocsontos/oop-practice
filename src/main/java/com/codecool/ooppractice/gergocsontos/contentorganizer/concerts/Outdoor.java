package com.codecool.ooppractice.gergocsontos.contentorganizer.concerts;

import com.codecool.ooppractice.gergocsontos.contentorganizer.bands.Band;

public class Outdoor extends Concert {

    static final int CAPACITY = 5000;
    static final int DURATION = 120;
    static final int BEER_PRICE = 800;

    private boolean isCancelled = false;

    public Outdoor(Band mainBand, int ticketPrice) {
        super(mainBand, ticketPrice, CAPACITY, DURATION, BEER_PRICE);
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
}
