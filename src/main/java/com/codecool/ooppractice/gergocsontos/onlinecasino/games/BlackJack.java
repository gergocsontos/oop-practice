package com.codecool.ooppractice.gergocsontos.onlinecasino.games;

import java.math.BigDecimal;

public class BlackJack extends DealerGame {
    final static BigDecimal DAILY_PROFIT = new BigDecimal("1000000");
    final static int MAX_PLAYERS = 6;

    public BlackJack(BigDecimal gameBank) {
        super(gameBank, MAX_PLAYERS, DAILY_PROFIT);
    }

    @Override
    public void play() {
        System.out.println("BlackJACK is played!");
    }


}
