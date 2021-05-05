package com.company;

public class InstructorManager extends UserManager{
    public void showInfo(Student user){
        System.out.printf("%s %s is giving %s%n",
                user.getFirstName(),
                user.getLastName(),
                user.getTakenCourse());
    }
}
