package com.abubakar.properties.abstraction;

public class Example2 {
//    Rule: If there is an abstract method in a class, that class must be abstract.
    static abstract class Bank {
        abstract int getRateOfInterest();
    }

    static class SBI extends Bank {
        int getRateOfInterest() {
            return 7;
        }
    }

    static class PNB extends Bank {
        int getRateOfInterest() {
            return 8;
        }
    }

    public static void main(String args[]) {
        Bank b;
        b = new SBI();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
        b = new PNB();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
    }
}
