package com.abubakar.properties.inheritance;


import java.util.ArrayList;

public class Box_Weight extends Box {
    double weight;

    Box_Weight() {
        this.weight = -12;
        System.out.println(weight);
    }




    //    @Override
    static void greeting() {
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
        ArrayList list = new ArrayList();
    }

    Box_Weight(Box_Weight other) {
        super(other);
        weight = other.weight;
        System.out.println(weight);
    }

    Box_Weight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public Box_Weight(double l, double h, double w, double weight) {
        // used to initialise values present in parent class
        super(l); // what is this? call the parent class constructor
//        System.out.println(super.weight);
        this.weight = weight;
    }

}