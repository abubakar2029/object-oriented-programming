package com.abubakar.generics;

@FunctionalInterface
interface StringModifier {
    String modify(String str);
}

@FunctionalInterface
interface MathOperation {
    String operate(int a, int b);
}

public class LambdaExpression {
    //    These are block of code that has some param and a return type
    public static void main(String[] args) {

// lambda to convert string to uppercase letters
        StringModifier upperCase = str -> str.toUpperCase();
        System.out.println(upperCase.modify("hello"));

//        lambda to reverse a string
        StringModifier reverseString = s -> new StringBuilder(s).reverse().toString();
        System.out.println(reverseString.modify("hello"));

//        lambda to add two integers
        MathOperation addIntegers = (a, b) -> (a + b) + "";
        System.out.println(addIntegers.operate(5, 3));
    }
}
