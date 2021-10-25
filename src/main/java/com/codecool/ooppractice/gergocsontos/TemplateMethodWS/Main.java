package com.codecool.ooppractice.gergocsontos.TemplateMethodWS;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();

        Random random = new Random();
        Russian russian = new Russian("Blond", 20);
        humanList.add(russian);
        humanList.add(new English("red", 15));
        humanList.add(new Spanish("black", 5));
        humanList.forEach(human -> human.haveDrinks(random.nextInt(30)));
         humanList.forEach(human -> System.out.println(human.toString()));


    }
}
