package com.abubakar.singleton;

public class Main {
    private static Singleton obj;

    public static void main(String[] args) {
//        Singleton obj = new Singleton();
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        System.out.println(obj);
        System.out.println(obj2);
        System.out.println(obj3);

    }
}
