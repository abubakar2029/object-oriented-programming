package com.abubakar.staticExample;

// this is a demo to show initialisation of static variables
public class staticBlock {
    static int a = 4;
    static int b;

    // will only run once, when the first obj is create i.e. when the class is loaded for the first time
    // works as a constructor, but for the class itself rather than its objects.
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);

        staticBlock.b += 3;

        System.out.println(staticBlock.a + " " + staticBlock.b);

        staticBlock obj2 = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);
    }

}