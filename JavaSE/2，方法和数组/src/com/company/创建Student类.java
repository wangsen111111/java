package com.company;
//学生类
public class 创建Student类 {
    //成员变量
        private String name;
        private int age;
    //构造方法

    public 创建Student类() {
    }

    public 创建Student类(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //成员方法getxxx（）/setxxx()

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

    @Override
    public String toString() {
        return "创建Student类{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
