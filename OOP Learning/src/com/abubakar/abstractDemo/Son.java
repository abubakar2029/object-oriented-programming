package com.abubakar.abstractDemo;

public class Son extends Parent{
    public Son(int income) {
        super(income);
    }
    @Override
    void career(){
        System.out.println("I am choosing career of a Chef");
    }
    @Override
    int returnIncome(){
        return income;
    }
}
