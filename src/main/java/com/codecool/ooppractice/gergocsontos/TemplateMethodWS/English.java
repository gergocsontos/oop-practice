package com.codecool.ooppractice.gergocsontos.TemplateMethodWS;

public class English extends Human {

    public English(String hairColor, int dailyDrinks) {
        super("English", hairColor, dailyDrinks);
    }

    @Override
    public void cheers() {
        System.out.println("Cheers, mate!");
    }

    @Override
    public void vomit() {
        System.out.println("Blueaghh..");
    }

    @Override
    public String toString() {
        return "English{" +
                "isHungover=" + isHungover +
                ", language='" + language + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", dailyDrinks=" + dailyDrinks +
                ", drinkCount=" + drinkCount +
                '}';
    }
}
