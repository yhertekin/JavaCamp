package com.company;

public class Student extends User{
    private String takenCourse;

    public Student(String firstName, String lastName, String takenCourse){
        super(firstName, lastName);
        this.takenCourse = takenCourse;
    }

    public String getTakenCourse(){
        return takenCourse;
    }

    public void setTakenCourse(String courseName){
        this.takenCourse = courseName;
    }


}
