package com.codecool.ooppractice.gergocsontos.TemplateMethodWS;

public class Spanish extends Human {
    public Spanish(String hairColor, int dailyDrinks) {
        super("Spanish", hairColor, dailyDrinks);
    }

    @Override
    public void cheers() {
        System.out.println("Salud!");

    }

    @Override
    public void vomit() {
        System.out.println("Pendejo mierda!");
    }

    @Override
    public String toString() {
        return "Spanish{" +
                "isHungover=" + isHungover +
                ", language='" + language + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", dailyDrinks=" + dailyDrinks +
                ", drinkCount=" + drinkCount +
                '}';
    }
}
