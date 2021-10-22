package com.codecool.ooppractice.gergocsontos.contentorganizer.concerts;

import com.codecool.ooppractice.gergocsontos.contentorganizer.bands.Band;
import com.codecool.ooppractice.gergocsontos.contentorganizer.bands.BandType;

import java.util.Optional;

public abstract class Concert {
    protected Band mainBand;
    protected Band warmupBand;
    protected int capacity;
    protected int duration;
    protected int ticketPrice;
    protected int ticketCounter = 0;
    protected int beerPrice;
    protected int beerCounter = 0;

    public Concert(Band mainBand, int ticketPrice) {
        this.mainBand = mainBand;
        mainBand.setType(BandType.MAIN);
        Optional<Band> warmupBand = mainBand.chooseWarmup();
        this.warmupBand = warmupBand.orElse(null);
        if (warmupBand.isPresent()) {
            this.warmupBand.setType(BandType.WARM_UP);
        }
        this.ticketPrice = validateTicketPrice(ticketPrice);
    }

    protected int validateTicketPrice(int price) {
        if (price >= 12000 && price <= 15000) {
            return price;
        }
        throw new IllegalArgumentException("Ticket Price is out of proper range!");
    }

    public void sellTicket() {
        if (ticketCounter < capacity) {
            ticketCounter++;
        } else {
            throw new RuntimeException("The concert has no more tickets to sell!");
        }
    }

    public void sellBeer() {
        beerCounter++;
    }

    public double calculateProfit() {
        return (beerCounter * beerPrice) + (ticketCounter * ticketPrice) * 0.4;
    }

    @Override
    public String toString() {
        return "Concert{" +
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
