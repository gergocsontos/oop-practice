package com.codecool.ooppractice.gergocsontos.onlinecasino.games;

import com.codecool.ooppractice.gergocsontos.onlinecasino.Dealer;

import java.math.BigDecimal;

public class Roulette extends DealerGame {
    final static BigDecimal DAILY_PROFIT = new BigDecimal("2000000");
    final static int MAX_PLAYERS = 8;
    private final static int MIN_DEALER_EXP = 3;

    public Roulette(BigDecimal gameBank) {
        super(gameBank, MAX_PLAYERS, DAILY_PROFIT);
    }

    @Override
    public void play() {
        System.out.println("Roulette is played!");
    }

    @Override
    public void setDealer(Dealer dealer) {
        if (dealer.getExperience().getLevel() >= MIN_DEALER_EXP) {
            super.setDealer(dealer);
        } else {
            throw new RuntimeException("Dealer Experience is too low!");
        }
    }
}
