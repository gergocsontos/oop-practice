package com.codecool.ooppractice.gergocsontos.TemplateMethodWS;

public abstract class Human {
    protected boolean isHungover = false;
    protected String language;
    protected String hairColor;
    protected int dailyDrinks;
    protected int drinkCount = 0;

    public Human(String language, String hairColor, int dailyDrinks) {
        this.language = language;
        this.hairColor = hairColor;
        this.dailyDrinks = dailyDrinks;
    }

    public void haveDrinks (int x) {
        for (int i = 0; i < x; i++) {
            drink();
        }
    }

    public void drink() {
        cheers();
        drinkCount++;
        if (drinkCount > dailyDrinks) {
            vomit();
            isHungover = true;
        }

    }

    public void speak() {
        System.out.println("I speak " + language);
    }

    public abstract void cheers();

    protected abstract void vomit();


}
