package com.company;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Yasef", "Ertekin", "Java");
        StudentManager studentManager = new StudentManager();
        UserManager userManager = new UserManager();

        student.setFirstName("Yasef");
        student.setLastName("Ertekin");
        student.setTakenCourse("Java");
        userManager.addUser(student);

        studentManager.showInfo(student);



    }
}
