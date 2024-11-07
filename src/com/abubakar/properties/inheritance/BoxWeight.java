package com.abubakar.properties.inheritance;


import java.util.ArrayList;

public class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        this.weight = -12;
        System.out.println(weight);
    }




    //    @Override
    static void greeting() {
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
        ArrayList list = new ArrayList();
    }

    BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
        System.out.println(weight);
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        // used to initialise values present in parent class
        super(l); // what is this? call the parent class constructor
//        System.out.println(super.weight);
        this.weight = weight;
    }

}