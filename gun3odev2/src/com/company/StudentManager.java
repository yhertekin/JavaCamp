package com.company;

public class StudentManager extends UserManager{
    public void showInfo(Student user){
        System.out.printf("%s %s is taking %s%n",
                user.getFirstName(),
                user.getLastName(),
                user.getTakenCourse());
    }
}
