package com.abubakar.interfaces;

public class FoodClass implements Food {

    @Override
    public void food() {
        System.out.println("Eat food 3 times a day");
    }

    @Override
    public void favorite() {
        System.out.println("Favorite food is Zinger burger");
    }
}
