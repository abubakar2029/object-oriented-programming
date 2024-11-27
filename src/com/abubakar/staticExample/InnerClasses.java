package com.abubakar.staticExample;

public class InnerClasses {

    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

//        IT'S OVER-RIDING TOSTRING METHOD WITH IT'S OWN ONE
        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a);

        System.out.println(a.name);
//        System.out.println(b.name);
    }
}

//static class A {
//
//}