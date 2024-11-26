package com.abubakar.interfaces;

public class EntertainmentClass implements Entertainment {
    @Override
    public void entertainmentSource() {
        System.out.println("One of entertainment source is travelling");
    }

    @Override
    public void favorite() {
        System.out.println("Likes to visit mountains" + interfaceVariable);
    }
//        Variables of interface can be called directly in implementing class

}
