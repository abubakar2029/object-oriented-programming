package com.abubakar.interfaces;

public class Human2 {
    Entertainment entertainment;
    Food food;

    public Human2() {
        entertainment = new EntertainmentClass();
        food = new FoodClass();
    }

    public void favoriteFood(){
        food.favorite();
    }
    public void favoriteEntertainment(){
        entertainment.favorite();
    }
}
