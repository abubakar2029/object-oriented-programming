package com.abubakar.abstractDemo;

public class Daughter extends Parent{
    public Daughter(int income) {
        super(income);
    }
    @Override
    void career(){
        System.out.println("I am choosing career of a Social Worker");
    }
    @Override
    int returnIncome(){
        return income;
    }
}
