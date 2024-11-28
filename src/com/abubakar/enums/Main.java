package com.abubakar.enums;

public class Main {
    enum BodyPArts implements A {
        Arms, Hands, Feet, Face, Nose, Hair;
        // these are enum constants
        // public, static and final
        // since its final you cannot create child enums
        // type is BodyPArts

        @Override
        public void display() {

        }

        BodyPArts() {
            System.out.println("Constructor called for " + this);
        }
    }

    public static void main(String[] args) {
        BodyPArts HumanBody;
        HumanBody = BodyPArts.Feet;

        System.out.println(HumanBody);
        System.out.println(HumanBody.ordinal());

        for (BodyPArts a : BodyPArts.values()) {
            System.out.println(a);
        }
    }
}
