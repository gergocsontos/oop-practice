package com.codecool.ooppractice.gergocsontos.onlinecasino.games;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public abstract class Game {
    private final UUID id;
    private BigDecimal gameBank;
    private int maxPlayers;
    private BigDecimal dailyProfit;

    public Game(BigDecimal gameBank, int maxPlayers, BigDecimal dailyProfit) {
        this.id = UUID.randomUUID();
        this.gameBank = gameBank;
        this.maxPlayers = maxPlayers;
        this.dailyProfit = dailyProfit;
    }

    public abstract void play();

    public BigDecimal getGameBank() {
        return gameBank;
    }

    public BigDecimal getDailyProfit() {
        return dailyProfit;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id.equals(game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
