package com.abubakar.access;

public class Object_Demo {
//    Object Class is the root of all elements
//     cannot over-ride final
    int num;

    public Object_Demo(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((Object_Demo) obj).num;
    }


    //    We can Over-ride the default methods to our requirements
    @Override
    public int hashCode() {
        return num;
    }

    public static void main(String[] args) {
        Object_Demo obj1 = new Object_Demo(33);
        Object_Demo obj2 = new Object_Demo(33);

//        Here it is trying to check their addresses
        if (obj1 == obj2) {
            System.out.println("Objects are equal");
        }

        if (obj1.equals(obj2)) {
            System.out.println("Objects are equal and check through euals method");
        }
        System.out.println(obj1.hashCode()); // returning my default number
    }
}
