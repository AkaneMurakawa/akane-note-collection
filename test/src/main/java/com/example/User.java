package com.example;

public class User {

    public String name;

    public String url;

    public User(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
