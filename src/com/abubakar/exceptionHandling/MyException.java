package com.abubakar.exceptionHandling;

public class MyException extends RuntimeException {
    MyException(String message) {
        super(message);
        System.out.println("In myexception Constructor");
    }
}
