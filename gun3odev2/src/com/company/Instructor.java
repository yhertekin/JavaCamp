package com.company;

public class Instructor extends User{
    private String givenCourse;

    public Instructor(String firstName, String lastName, String givenCourse){
        super(firstName, lastName);
        this.givenCourse = givenCourse;
    }

    public String getGivenCourse(){
        return givenCourse;
    }

    public void setGivenCourse(String courseName){
        this.givenCourse = courseName;
    }
}
