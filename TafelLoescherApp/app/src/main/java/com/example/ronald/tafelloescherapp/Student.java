package com.example.ronald.tafelloescherapp;

/**
 * Created by ronald on 2/21/2018.
 */

public class Student {

    private String name, user_class, email, uid;

    public Student()
    {

    }

    public Student(String name, String user_class, String email, String uid) {
        this.name = name;
        this.user_class = user_class;
        this.email = email;
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_class() {
        return user_class;
    }

    public void setUser_class(String user_class) {
        this.user_class = user_class;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
