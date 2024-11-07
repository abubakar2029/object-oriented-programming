package com.abubakar.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6);

        Box box2 = new Box(box1);
//        System.out.println(box1.w + " " + box1.h);
//        System.out.println(box2.w + " " + box2.h);

        BoxWeight box3 = new BoxWeight();

        BoxWeight box4 = new BoxWeight(box3);

        Box box5=new BoxWeight();
        System.out.println(box5);
    }
}
