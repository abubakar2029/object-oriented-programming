package com.abubakar.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 0;
        try {
            if (b == 0) {
                throw new MyException("Throwing exception manually");
            }
//            int c=a/b;
        } catch (MyException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("It will execute no matter error or exception occurs or not");
        }
    }
}
