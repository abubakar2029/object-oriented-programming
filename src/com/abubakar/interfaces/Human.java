package com.abubakar.interfaces;

public class Human implements Food, Entertainment, Financial {

    String favoriteFood;
    String earningSource;
    String entertainingSource;

    public Human(String favoriteFood, String earningSource, String entertainingSource) {
        this.favoriteFood = favoriteFood;
        this.earningSource = earningSource;
        this.entertainingSource = entertainingSource;
    }

    @Override
    public void entertainmentSource() {
        System.out.println("For entertainment, I love to " + entertainingSource);
    }

    @Override
    public void earningSource() {
        System.out.println("To manage financials, I " + earningSource);

    }

    @Override
    public void favoriteFood() {
        System.out.println("I love to eat " + favoriteFood);
    }
}
