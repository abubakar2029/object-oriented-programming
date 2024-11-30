package com.abubakar.properties.polymorphism;

public class Runtime_Polymorphism {
//    In runtime polymorphism, it determines on runtime which method to call
//    however in static polymorphism it determines on compile time while compiling the code

    public static class Shape {
        public void area() {
            System.out.println("Area of Shape");
        }
    }

    public static void main(String[] args) {

//        SOLUTION TO ERROR
//        The error occurs because non-static nested (inner) classes in Java are tied to an instance of the outer class.
        Shape shape;

        shape = new Circle();
        shape.area();

        shape = new Square();
        shape.area();

        shape = new Shape();
        shape.area();
    }


    public static class Circle extends Shape {
        @Override
        public void area() {
            System.out.println("Area of Circle");
        }
    }

    public static class Square extends Shape {
        @Override
        public void area() {
            System.out.println("Area of Square");
        }
    }
}