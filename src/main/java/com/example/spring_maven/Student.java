package com.example.spring_maven;

public class Student {
    private String name;
    private int age;
    private int admitnNo;
    private String state;

    public Student(String name, int age, int admitnNo, String state) {
        this.name = name;
        this.age = age;
        this.admitnNo = admitnNo;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAdmitnNo() {
        return admitnNo;
    }

    public void setAdmitnNo(int admitnNo) {
        this.admitnNo = admitnNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
