package com.codecool.ooppractice.gergocsontos.onlinecasino.games;

import java.math.BigDecimal;

public class SlotMachine extends Game {
    final static BigDecimal DAILY_PROFIT = new BigDecimal("500000");
    final static int MAX_PLAYERS = 1;
    private int roundsSinceWin = 0;
    public SlotMachine(BigDecimal gameBank) {
        super(gameBank, MAX_PLAYERS, DAILY_PROFIT);
    }

    @Override
    public void play() {
        System.out.println("Slot is played!");
        if (hasWon()) {
            roundsSinceWin = 0;
        } else {
            roundsSinceWin++;
        }
    }

    private boolean hasWon() {
        return false;
    }

}
