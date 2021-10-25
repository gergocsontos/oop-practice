package com.codecool.ooppractice.gergocsontos.TemplateMethodWS;

public class Russian extends Human {
    public Russian(String hairColor, int dailyDrinks) {
        super("Russian", hairColor, dailyDrinks);
    }

    @Override
    public void cheers() {
        System.out.println("Da Vodka!");


    }

    @Override
    public void vomit() {
        System.out.println("Сволочь..");

    }

    @Override
    public String toString() {
        return "Russian{" +
                "isHungover=" + isHungover +
                ", language='" + language + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", dailyDrinks=" + dailyDrinks +
                ", drinkCount=" + drinkCount +
                '}';
    }
}
