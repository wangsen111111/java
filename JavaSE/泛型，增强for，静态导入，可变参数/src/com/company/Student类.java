package com.company;

public class Student类 {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student类( String name,int age) {
        this.age = age;
        this.name = name;
    }
}
