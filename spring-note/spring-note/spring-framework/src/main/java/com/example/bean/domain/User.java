package com.example.bean.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class User {

    private String name;

    private String bio;

    @PostConstruct
    public void postConstruct(){
        System.out.println("postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("PreDestroy");
    }


    public User() {
        System.out.println("User construct");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }

    public static User createDefaultUser(){
        User user = new User();
        user.setName("Akane");
        return user;
    }
}
