package com.abubakar.singleton;

public class Singleton {
    private static Singleton singelton;

    private Singleton() {
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}