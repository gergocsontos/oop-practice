package com.codecool.ooppractice.gergocsontos.onlinecasino;

import com.codecool.ooppractice.gergocsontos.onlinecasino.games.Game;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Casino {
    private BigDecimal casinoBank;
    private final Set<Game> games = new HashSet<>();

    public Casino(BigDecimal casinoBank) {
        this.casinoBank = casinoBank;
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public BigDecimal totalBalance() {
        BigDecimal totalOfGames = games.stream().map(Game::getGameBank).reduce(BigDecimal.ZERO, BigDecimal::add);
        return totalOfGames.add(casinoBank);
    }

    public BigDecimal profitForDay() {
        return games.stream().map(Game::getDailyProfit).reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
