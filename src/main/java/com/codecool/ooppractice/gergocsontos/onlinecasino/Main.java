package com.codecool.ooppractice.gergocsontos.onlinecasino;

import com.codecool.ooppractice.gergocsontos.onlinecasino.games.Roulette;
import com.codecool.ooppractice.gergocsontos.onlinecasino.games.SlotMachine;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Online Casino!");
        Casino casino = new Casino(new BigDecimal("2000000"));
        SlotMachine machine = new SlotMachine(new BigDecimal("500000"));
        Roulette roulette = new Roulette(new BigDecimal("500000"));
        Dealer dealerPro = new Dealer("Peter Pro", DealerExperience.PRO);
        roulette.setDealer(dealerPro);
        casino.addGame(machine);
        casino.addGame(roulette);
        System.out.println(casino.profitForDay());
        System.out.println(casino.totalBalance());
    }
}
