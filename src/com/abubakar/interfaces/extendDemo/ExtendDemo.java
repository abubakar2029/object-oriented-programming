package com.abubakar.interfaces.extendDemo;

public class ExtendDemo implements B {
    @Override
    public void methodB() {
        System.out.println("Method of B interface");
    }

    @Override
    public void methodA() {
        System.out.println("Method of A interface extends in B");
    }

    public static void main(String[] args) {
        ExtendDemo demo =new ExtendDemo();
        demo.methodA();
        demo.methodB();
//        Variables of interface can be called directly in implementing class
        System.out.println(AB);
    }
}
