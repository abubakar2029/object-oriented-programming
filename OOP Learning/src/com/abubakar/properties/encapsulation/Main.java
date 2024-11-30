package com.abubakar.properties.encapsulation;

public class Main {
//    In Encapsulation we are making the fields private to have more control and security
//     Encapsulation is the bundling of data (variables) and methods (functions) that operate on the data into a single unit, typically a class.
    public static void main(String[] args) {
        Student AbuBakar = new Student("AbuBakar", "2022-ag-7991");
        System.out.println(AbuBakar.getName());
        System.out.println(AbuBakar.getStudentID());
    }

    public static class Student {
        private String name;
        private String studentID;

        public Student(String name, String studentID) {
            this.name = name;
            this.studentID = studentID;
        }

        public String getName() {
            return name;
        }

        public String getStudentID() {
            return studentID;
        }
    }
}
