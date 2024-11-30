package com.abubakar.properties.abstraction;

public class Example1 {
    //  Abstraction focuses on the design stuff
//   Abstraction focuses on hiding complex implementation details from the user and only exposing the essential features or functionalities.
//    Abstraction is a process of hiding the implementation details and showing only functionality to the user.
    static abstract class Bike {
        abstract void run();
    }

    public static class Honda4 extends Bike {
        void run() {
            System.out.println("running safely");
        }
    }

    public static void main(String args[]) {
        Bike obj = new Honda4();
        obj.run();
    }
}

//  Can't create onjects of Abstract Class because abstract methods might not have body