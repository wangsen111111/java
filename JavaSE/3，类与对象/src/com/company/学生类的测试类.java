package com.company;

import java.util.Scanner;//导包

/*
类的组成：成员变量，成员方法       ||构造方法
           成员方法{
                   根据返回值（void类型和非void类型）
                   根据形式参数（空参方法和非空参方法）}
 */
//学生类
class Student {
    //构造无参有返回值方法
    public String getString() {
        return "调用啦无参有返回值方法";
    }

    // 构造无参无返回值方法
    public void show() {
        System.out.println("调用啦无参无返回值方法");
    }

    // 构造有参无返回值方法
    public void method(String name) {
        System.out.println(name);
    }

    //构造有参有返回值方法
    public String pinJie(String s1, String s2) {
        return s1 + s2;
    }
}

//检验类Main
public class 学生类的测试类 {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        //调用啦无参有返回值方法
        s.show();
        //调用无参有返回值方法
        System.out.println(s.getString());
        //调用带参无返回值的方法
        s.method("调用带参无返回值的方法");
        //调用啦有参有返回值值方法
        System.out.println(s.pinJie("调用啦", "带参有返回值的方法"));


    }
}


