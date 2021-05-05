package com.company;

public class UserManager {
    public void addUser(User user){
        System.out.println("User Added: " + user.getId());
    }

    public void removeUser(User user){
        System.out.println("User removed: " + user.getId());
    }

    public void showInfo(User user){
        System.out.println(user.getId());
    }

}
