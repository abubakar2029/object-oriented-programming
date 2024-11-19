package com.abubakar.properties.polymorphism;

public class Static_Polymorphism {
    //    Acheived via Method Over-loading
//    Same name but different return types, parameters
    public static void main(String[] args) {
        Student Check = new Student();
        Student Awais = new Student("Awais", "Male", 5.5);
        Student Huzaifa = new Student("Huzaifa", "Male", 6.5);

        Check.displayInfo();

        Awais.displayInfo();
        Huzaifa.displayInfo();
    }

    // Example via constructor overloading
    public static class Student {
        private String name;
        private double height;
        private String gender;

        public Student() {
            this.name = "Temporary name";
            this.gender = "Male";
            this.height = 5.5;
        }

        private Student(String name, String gender, double height) {
            this.name = name;
            this.gender = gender;
            this.height = height;
        }

        public void displayInfo() {
            System.out.println("Name: " + name + ", Gender: " + gender + ", Height: " + height + " ft");
        }
    }
}
