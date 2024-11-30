package com.abubakar.abstractDemo;

abstract public class Parent {

    static String message = "Hi! it's Friday 22 November,2024";
    final int income;

    public Parent(int childIncome) {
        income = (66 + childIncome);
    }
    abstract int returnIncome();
    abstract void career();
}
