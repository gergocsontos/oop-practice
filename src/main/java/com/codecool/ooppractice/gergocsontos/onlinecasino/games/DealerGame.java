package com.codecool.ooppractice.gergocsontos.onlinecasino.games;

import com.codecool.ooppractice.gergocsontos.onlinecasino.Dealer;

import java.math.BigDecimal;

public abstract class DealerGame extends Game {
    private Dealer dealer;

    public DealerGame(BigDecimal gameBank, int maxPlayers, BigDecimal dailyProfit) {
        super(gameBank, maxPlayers, dailyProfit);
    }

    @Override
    public BigDecimal getDailyProfit() {
        if (dealer != null) {
            return super.getDailyProfit().subtract(dealer.getExperience().getSalary());
        }
        return BigDecimal.ZERO;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public Dealer getDealer() {
        return dealer;
    }
}
