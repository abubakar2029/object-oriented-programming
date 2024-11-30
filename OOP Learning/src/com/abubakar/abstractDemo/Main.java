package com.abubakar.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son AbuBakar = new Son(22);
        Daughter Fatima = new Daughter(22);

//        Although parent can't initialize a class, but it can be used as a reference variable
        Parent Ahmed = new Son(22);

        AbuBakar.career();
        Fatima.career();
        System.out.println(Parent.message);
        System.out.println(Ahmed.returnIncome());
    }
}
