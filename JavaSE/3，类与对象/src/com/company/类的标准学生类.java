package com.company;
/*
 学生类：（一个基本类）
       成员变量：name，age。
       构造方法：无参，带两个参
       成员方法：getxxx（）/setxxx（）单个赋值
                 show（）；//输出该类的所有成员变量值
         给成员变量赋值：a:setxxx（）方法    b:构造方法
         输出成员变量值：a:通过getxxx（）方法获取然后拼接   b:show（）方法
 */
//定义学生类1
class Student1 {
    //姓名
    private String name;
    //年龄
    private int age;

    //构造方法
    public Student1() {
    }//无参构造

    //带多个参数方法
    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //获取name方法
    public String getName() {
        return name;
    }

    //设立name
    public void setName(String name) {
        this.name = name;
    }

    //获取age方法
    public int getAge() {
        return age;
    }

    //设立age
    public void setAge(int age) {
        this.age = age;
    }

    //加个show方法输出所有成员变量值
    public void show() {
        System.out.println(name + "............" + age);
    }
}

//检验学生类
public class 类的标准学生类 {
    public static void main(String[] args) {
        //无参构造+setxxx（）给成员变量赋值
        Student1 s1 = new Student1();
        s1.setName("王森");
        s1.setAge(18);
        //输出值
        System.out.println("方法1：" + s1.getName() + ".........." + s1.getAge());
        s1.show();
        System.out.println("方法2给成员变量赋值：");
        Student1 s2 = new Student1("王森", 18);
        //方法2输出值
        System.out.println("方法2：" + s2.getName() + ".........." + s2.getAge());
        s2.show();


    }
}
